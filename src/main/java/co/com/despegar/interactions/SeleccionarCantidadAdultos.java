package co.com.despegar.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.despegar.userinterfaces.HomePage.*;

public class SeleccionarCantidadAdultos implements Interaction {

    private String cantidadEsperada;
    private int iCantidadActual = 2;
    private int contador;

    public SeleccionarCantidadAdultos(String cantidadEsperada, int contador) {
        this.cantidadEsperada = cantidadEsperada;
        this.contador = contador;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        int iCantidadEsperada = Integer.parseInt(cantidadEsperada);

        if (iCantidadActual != iCantidadEsperada) {
            if (iCantidadActual < iCantidadEsperada) {
                while (iCantidadEsperada != iCantidadActual) {
                    iCantidadActual++;
                    actor.attemptsTo(Click.on(BTN_AUMENTAR_ADULTOS.of(Integer.toString(contador))));
                }
            } else if (iCantidadActual > iCantidadEsperada) {
                while (iCantidadEsperada != iCantidadActual) {
                    iCantidadActual--;
                    actor.attemptsTo(Click.on(BTN_DISMINUIR_ADULTOS.of(Integer.toString(contador))));
                }
            }
        }
    }

    public static Performable aReservar(String cantidadEsperada, int contador) {
        return instrumented(SeleccionarCantidadAdultos.class, cantidadEsperada, contador);
    }
}
