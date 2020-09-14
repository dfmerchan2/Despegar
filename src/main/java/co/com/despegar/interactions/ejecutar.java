package co.com.despegar.interactions;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

public class ejecutar {
    public static void main(String[] args) {

        System.out.println(obtener("02-17-2020"));

    }

    public static String obtener(String fecha) {
        String aMes[] = fecha.split("-");
        String mes = aMes[0];
        return new DateFormatSymbols().getMonths()[Integer.parseInt(mes)-1];
    }

    public static String year(String fecha){
        String aYear [] = fecha.split("-");
        return aYear[2];
    }
}
