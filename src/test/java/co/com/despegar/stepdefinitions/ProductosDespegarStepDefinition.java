package co.com.despegar.stepdefinitions;

import co.com.despegar.exceptions.CantidadIncorrecta;
import co.com.despegar.interactions.AbrirNavegador;
import co.com.despegar.questions.ValidarContidad;
import co.com.despegar.task.BuscarAlojamiento;
import co.com.despegar.task.SeleccionarAlojamiento;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static co.com.despegar.model.builder.BuscarBuilder.informacion;
import static co.com.despegar.utils.Constantes.CANTIDAD_PERSONAS_INCORRECTA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ProductosDespegarStepDefinition {

    @Dado("^que (.*) ingresa a la pagina de despegar$")
    public void queDiegoIngresaALaPaginaDeDespegar(String actor) {
        theActorCalled(actor).attemptsTo(
                AbrirNavegador.deDespegar()
        );
    }

    @Cuando("^ingrese la informacion solicitada para el alojamiento$")
    public void ingreseLaInformacionSolicitadaParaElAlojamiento(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(
                BuscarAlojamiento.aReservar(informacion()
                        .conDestino(data.get(0).get("Destino"))
                        .conFechaSalida(data.get(0).get("FechaIngreso"))
                        .conFechaRegreso(data.get(0).get("FechaSalida"))
                        .conCantidadAdultos(data.get(0).get("CantidadAdultos"))
                        .conCantidadMenores(data.get(0).get("CantidadMenores"))
                        .conCantidadHabitaciones(data.get(0).get("CantidadHabitaciones"))
                        .conEdad(data.get(0).get("Edad"))));
    }

    @Y("^selecciona la categoria a ordenar$")
    public void seleccionaElHotelMasEconomico(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(
               SeleccionarAlojamiento.aReservar(informacion().conOrdenar(data.get(0).get("Ordenar")))
        );
    }

    @Entonces("^observa el detalle del hotel$")
    public void validaElDetalleDelHotel() {

    }

    @Y("^realiza la reserva$")
    public void realizaLaReserva(List<Map<String, String>> data) {

    }

}
