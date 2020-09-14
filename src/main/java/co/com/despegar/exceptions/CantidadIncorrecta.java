package co.com.despegar.exceptions;

public class CantidadIncorrecta extends AssertionError {
    public CantidadIncorrecta(String mensaje, Throwable causa) {
        super(mensaje,causa);
    }
}
