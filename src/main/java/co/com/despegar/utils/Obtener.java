package co.com.despegar.utils;

import java.text.DateFormatSymbols;

public class Obtener {

    public static String mes(String fecha) {
        String aMes[] = fecha.split("-");
        String mes = aMes[0];
        return new DateFormatSymbols().getMonths()[Integer.parseInt(mes) - 1];
    }

    public static String year(String fecha) {
        String year[] = fecha.split("-");
        return year[2];
    }

    public static String dia(String fecha) {
        String dia[] = fecha.split("-");
        return dia[1];
    }

}
