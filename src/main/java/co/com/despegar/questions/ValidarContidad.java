package co.com.despegar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.despegar.userinterfaces.HomePage.LBL_CANTIDAD_PERSONAS;

public class ValidarContidad implements Question <String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_CANTIDAD_PERSONAS).viewedBy(actor).asString();
    }

    public static  ValidarContidad dePersonas(){
        return new ValidarContidad();
    }
}
