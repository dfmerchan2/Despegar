package co.com.despegar.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ResultadosPage {

    public static final Target BTN_ORDENAR_POR = Target.the("Boton para ordenar").located(By.xpath("(//div[@class='order-inline-item' ]//select[@class='select-tag'])[1]"));
    public static final Target BTN_SEGUIR = Target.the("Lista para ordenar").located(By.xpath("//em[@class='btn-text' and contains (.,'Seguir')]"));
    public static final Target LST_ORDENAR_POR = Target.the("Lista para ordenar").locatedBy("(//*[@class='select-option' and contains (.,'{0}')])[1]");
    public static final Target BTN_DETALLE = Target.the("Boton para ordenar").located(By.xpath("(//em[@class='btn-text' and contains (.,'Ver detalle')])[1]"));




}
