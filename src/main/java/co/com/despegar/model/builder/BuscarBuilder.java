package co.com.despegar.model.builder;

import co.com.despegar.model.Buscar;
import co.com.despegar.utils.Builder;

public class BuscarBuilder implements Builder<Buscar> {

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

    public static BuscarBuilder informacion() {
        return new BuscarBuilder();
    }

    public BuscarBuilder conTipoPromocion(String tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
        return this;
    }

    public BuscarBuilder conOrigen(String origen) {
        this.origen = origen;
        return this;
    }

    public BuscarBuilder conDestino(String destino) {
        this.destino = destino;
        return this;
    }

    public BuscarBuilder conDefinirFecha(String definirFecha) {
        this.definirFecha = definirFecha;
        return this;
    }

    public BuscarBuilder conFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }

    public BuscarBuilder conFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
        return this;
    }

    public BuscarBuilder conCantidadHabitaciones(String cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        return this;
    }

    public BuscarBuilder conCantidadAdultos(String cantidadAdultos) {
        this.cantidadAdultos = cantidadAdultos;
        return this;
    }

    public BuscarBuilder conCantidadMenores(String cantidadMenores) {
        this.cantidadMenores = cantidadMenores;
        return this;
    }

    public BuscarBuilder conEdad(String edad) {
        this.edad = edad;
        return this;
    }

    public BuscarBuilder conClase(String clase) {
        this.clase = clase;
        return this;
    }

    public BuscarBuilder conOrdenar(String ordenar){
        this.ordenar = ordenar;
        return this;
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

    public  String getOrdenar(){
        return ordenar;
    }

    @Override
    public Buscar builder() {
        return new Buscar(this);
    }
}
