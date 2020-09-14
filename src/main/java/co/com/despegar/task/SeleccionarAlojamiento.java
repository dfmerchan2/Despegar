package co.com.despegar.task;

import co.com.despegar.model.Buscar;
import co.com.despegar.model.builder.BuscarBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.despegar.userinterfaces.ResultadosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarAlojamiento implements Task {

    private Buscar buscar;

    public SeleccionarAlojamiento(Buscar buscar) {
        this.buscar = buscar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SEGUIR),
                Click.on(BTN_ORDENAR_POR)

              //Click.on(LST_ORDENAR_POR.of(buscar.getOrdenar()))
               //Click.on(BTN_DETALLE)

        );
    }

    public static Performable aReservar(BuscarBuilder buscarBuilder){
        return instrumented(SeleccionarAlojamiento.class, buscarBuilder.builder());
    }
}
