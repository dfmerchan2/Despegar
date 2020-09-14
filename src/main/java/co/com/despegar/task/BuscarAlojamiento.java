package co.com.despegar.task;

import co.com.despegar.interactions.Calendario;
import co.com.despegar.interactions.EsperaImplicita;
import co.com.despegar.interactions.IngresarHabitacion;
import co.com.despegar.model.Buscar;
import co.com.despegar.model.builder.BuscarBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.despegar.userinterfaces.HomePage.*;
import static co.com.despegar.utils.Constantes.ALOJAMIENTOS;
import static co.com.despegar.utils.Constantes.SI;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarAlojamiento implements Task {

    private Buscar buscar;

    public BuscarAlojamiento(Buscar buscar) {
        this.buscar = buscar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SERVICIO.of(ALOJAMIENTOS)),
                Click.on(TXT_DESTINO),
                EsperaImplicita.deTiempo(1),
                Enter.theValue(buscar.getDestino()).into(TXT_DESTINO),
                Click.on(BTN_CIUDAD.of(buscar.getDestino())),
                Click.on(BTN_CALENDARIO_IDA),
                Calendario.deFechas(buscar.getFechaSalida()),
                Calendario.deFechas(buscar.getFechaRegreso()),
                IngresarHabitacion.aReservar(buscar.getCantidadAdultos(), buscar.getCantidadMenores(), buscar.getCantidadHabitaciones(), buscar.getEdad()),
                Scroll.to(BTN_BUSCAR),
                Click.on(BTN_BUSCAR)
        );
    }

    public static Performable aReservar(BuscarBuilder buscarBuilder) {
        return instrumented(BuscarAlojamiento.class, buscarBuilder.builder());
    }
}
