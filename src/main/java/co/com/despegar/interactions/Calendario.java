package co.com.despegar.interactions;

import co.com.despegar.utils.Obtener;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.despegar.userinterfaces.HomePage.*;

public class Calendario implements Interaction {

    private String fecha;

    public Calendario(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo();
        while ((!Obtener.mes(fecha).equalsIgnoreCase(LBL_MES.resolveFor(actor).getText()) || !Obtener.year(fecha).equals(LBL_YEAR.resolveFor(actor).getText()))) {
            actor.attemptsTo(Click.on(BTN_DERECHAA));
        }
        actor.attemptsTo(Click.on(BTN_DIA.of(Obtener.dia(fecha))));
    }

    public static Performable deFechas(String fecha) {
        return instrumented(Calendario.class, fecha);
    }
}
