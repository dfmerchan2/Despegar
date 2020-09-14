package co.com.despegar.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_SERVICIO = Target.the("Boton de servicios").locatedBy("//label[@class='button-circle-label' and contains (.,'{0}')]");
    public static final Target TXT_DESTINO = Target.the("Caja de texto de destino").located(By.xpath("//input[@class='input-tag' and contains (@placeholder,'ciudad')]"));
    public static final Target BTN_CIUDAD = Target.the("Boton de ciudad").locatedBy("(//span[@class='item-text' and contains (.,'{0}')])[1]");
    public static final Target BTN_CALENDARIO_IDA = Target.the("Boton fecha de ida").located(By.xpath("//input[@class='input-tag' and contains (@placeholder,'Entrada')]"));
    public static final Target BTN_CALENDARIO_REGRESO = Target.the("Boton fecha de regreso").located(By.xpath("//input[@class='input-tag' and contains (@placeholder,'Salida')]"));
    public static final Target BTN_IZQUIERDA = Target.the("Boton flecha izquierda").located(By.id("ico-arrow-left"));
    public static final Target BTN_DERECHAA = Target.the("Boton flecha derecha").located(By.id("ico-arrow-right"));
    public static final Target LBL_MES = Target.the("Texto de mes").located(By.xpath("(//div[@class='sbox5-monthgrid-title-month'])[1]"));
    public static final Target LBL_YEAR = Target.the("Texto de año").located(By.xpath("(//div[@class='sbox5-monthgrid-title-year'])[1]"));
    public static final Target BTN_DIA = Target.the("Boton del dia").locatedBy("(//div[@class='sbox5-monthgrid-datenumber' and contains (.,'{0}')])[1]");

    public static final Target BTN_HABITACIONES = Target.the("Boton de habitaciones").located(By.className("sbox5-3-first-input-wrapper"));

    public static final Target BTN_DISMINUIR_ADULTOS = Target.the("Boton disminuar adultos").locatedBy("(//div[@class='stepper__room' and contains (.,'Habitación {0}')]//*[@id='svg-minus-3xwvNFB'])[1]");
    public static final Target BTN_AUMENTAR_ADULTOS = Target.the("Boton aumentar adultos").locatedBy("(//div[@class='stepper__room' and contains (.,'Habitación {0}')]//*[@id='svg-plus-3xwvNFB'])[1]");
    public static final Target BTN_DISMINUIR_MENORES = Target.the("Boton disminuar menores").locatedBy("(//div[@class='stepper__room' and contains (.,'Habitación {0}')]//*[@id='svg-minus-3xwvNFB'])[2]");
    public static final Target BTN_AUMENTAR_MENORES = Target.the("Boton aumentar menores").locatedBy("(//div[@class='stepper__room' and contains (.,'Habitación {0}')]//*[@id='svg-plus-3xwvNFB'])[2]");

    public static final Target LST_EDAD = Target.the("Lista edades").locatedBy("//div[@class='stepper__room' and contains (.,'Habitación {0}')]//div[@class='stepper__room__row' and contains (.,'menor {1}')]//select");
    public static final Target BTN_ANADIR_HABITACION = Target.the("Lista edades").located(By.xpath("//em[@class= 'btn-text' and contains (.,'habitaci')]"));
    public static final Target BTN_APLICAR = Target.the("Boton aplicar").located(By.xpath("//a[@class='sbox5-3-btn-ghost -md -primary']"));
    public static final Target BTN_BUSCAR = Target.the("Boton buscar").located(By.xpath("(//em[@class='btn-text' and contains (.,'Buscar')])[3]"));
    public static final Target LBL_CANTIDAD_PERSONAS = Target.the("Boton buscar").located(By.xpath("//input[@class='sbox5-3-second-input']"));
    public static final Target CKECK_FECHA = Target.the("Boton buscar").located(By.xpath("//input[@class='checkbox-tag']"));






}
