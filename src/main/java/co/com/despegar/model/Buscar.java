package co.com.despegar.model;

import co.com.despegar.model.builder.BuscarBuilder;

public class Buscar {

    private String tipoPromocion;
    private String origen;
    private String destino;
    private String definirFecha;
    private String fechaSalida;
    private String fechaRegreso;
    private String cantidadHabitaciones;
    private String cantidadAdultos;
    private String cantidadMenores;
    private String edad;
    private String clase;
    private String ordenar;

    public Buscar(BuscarBuilder buscarBuilder) {
        this.tipoPromocion = buscarBuilder.getTipoPromocion();
        this.origen = buscarBuilder.getOrigen();
        this.destino = buscarBuilder.getDestino();
        this.definirFecha = buscarBuilder.getDefinirFecha();
        this.fechaSalida = buscarBuilder.getFechaSalida();
        this.fechaRegreso = buscarBuilder.getFechaRegreso();
        this.cantidadHabitaciones = buscarBuilder.getCantidadHabitaciones();
        this.cantidadAdultos = buscarBuilder.getCantidadAdultos();
        this.cantidadMenores = buscarBuilder.getCantidadMenores();
        this.edad = buscarBuilder.getEdad();
        this.clase = buscarBuilder.getClase();
        this.ordenar = buscarBuilder.getOrdenar();
    }

    public String getTipoPromocion() {
        return tipoPromocion;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getDefinirFecha() {
        return definirFecha;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public String getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public String getCantidadAdultos() {
        return cantidadAdultos;
    }

    public String getCantidadMenores() {
        return cantidadMenores;
    }

    public String getEdad() {
        return edad;
    }

    public String getClase() {
        return clase;
    }

    public String getOrdenar() {
        return clase;
    }
}
