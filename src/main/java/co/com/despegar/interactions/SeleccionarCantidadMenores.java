package co.com.despegar.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.despegar.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCantidadMenores implements Interaction {

    private int iCantidadActual = 0;
    private String cantidadEsperada;
    private int contador;

    public SeleccionarCantidadMenores(String cantidadEsperada, int contador) {
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
                    actor.attemptsTo(Click.on(BTN_AUMENTAR_MENORES.of(Integer.toString(contador))));
                }
            } else if (iCantidadActual > iCantidadEsperada) {
                while (iCantidadEsperada != iCantidadActual) {
                    iCantidadActual--;
                    actor.attemptsTo(Click.on(BTN_DISMINUIR_MENORES.of(Integer.toString(contador))));
                }
            }
        }
    }

    public static Performable aReservar(String cantidadEsperada, int contador) {
        return instrumented(SeleccionarCantidadMenores.class, cantidadEsperada, contador);
    }
}
