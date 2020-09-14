package co.com.despegar.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.logging.Level;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.despegar.utils.Log.*;

public class EsperaImplicita implements Interaction {

    private int tiempo;

    public EsperaImplicita(int tiempo) {
        this.tiempo = tiempo*1000;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(tiempo);
        } catch (Exception e) {
            logger.log(Level.INFO, "Error en la espera");
        }
    }

    public static Performable deTiempo(int tiempo){
        return instrumented(EsperaImplicita.class, tiempo);
    }
}