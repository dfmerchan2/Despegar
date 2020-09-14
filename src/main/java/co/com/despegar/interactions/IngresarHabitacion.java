package co.com.despegar.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.stream.IntStream;

import static co.com.despegar.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarHabitacion implements Interaction {

    private String cantidadAdultos;
    private String cantidadMenores;
    private String cantidadHabitaciones;
    private String edad;


    public IngresarHabitacion(String cantidadAdultos, String cantidadMenores, String cantidadHabitaciones, String edad) {
        this.cantidadAdultos = cantidadAdultos;
        this.cantidadMenores = cantidadMenores;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.edad = edad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_HABITACIONES));
        IntStream.range(0, Integer.parseInt(cantidadHabitaciones)).forEach(i -> {
            actor.attemptsTo(
                    SeleccionarCantidadAdultos.aReservar(cantidadAdultos, i + 1),
                    SeleccionarCantidadMenores.aReservar(cantidadMenores, i + 1));
            IntStream.range(0, Integer.parseInt(cantidadMenores)).forEach(j -> {
                actor.attemptsTo(
                        SelectFromOptions.byValue(edad).from(LST_EDAD.of(Integer.toString(i + 1), (Integer.toString(j + 1))))
                );
            });

            if (Integer.parseInt(cantidadHabitaciones) != i + 1) {
                actor.attemptsTo(Click.on(BTN_ANADIR_HABITACION));
            }
        });
        actor.attemptsTo(Click.on(BTN_APLICAR));
    }

    public static Performable aReservar(String cantidadAdultos, String cantidadMenores, String cantidadHabitaciones, String edad) {
        return instrumented(IngresarHabitacion.class, cantidadAdultos, cantidadMenores, cantidadHabitaciones, edad);
    }
}
