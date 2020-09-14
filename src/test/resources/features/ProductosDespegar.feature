#language: es

Característica: Reserva de los diferentes servicios que proporciona despegar.com
  Yo como usuario de despegar.com
  Quiero buscar un servicio que se adecue a mis necesidades
  Para generar la reserva

  Antecedentes:
    Dado que Diego ingresa a la pagina de despegar

  @BuscarHoteles
  Esquema del escenario:
    Cuando ingrese la informacion solicitada para el alojamiento
      | Destino   | FechaIngreso   | FechaSalida   | CantidadHabitaciones   | CantidadAdultos   | CantidadMenores   | Edad   |
      | <Destino> | <FechaIngreso> | <FechaSalida> | <CantidadHabitaciones> | <CantidadAdultos> | <CantidadMenores> | <Edad> |
    Y  selecciona la categoria a ordenar
      | Ordenar   |
      | <Ordenar> |
    Entonces observa el detalle del hotel
    Y realiza la reserva
      | MedioPago   | Nombre   | Apellido   | Gmail   | Recibir Ofertas  | TipoTelefono   | CodigoPais   | Area   | Numero   |
      | <MedioPago> | <Nombre> | <Apellido> | <Gmail> | <RecibirOfertas> | <TipoTelefono> | <CodigoPais> | <Area> | <Numero> |

    Ejemplos:
      | Destino | FechaIngreso | FechaSalida | CantidadHabitaciones | CantidadAdultos | CantidadMenores | Edad | Ordenar               | MedioPago | Nombre | Apellido | Gmail | RecibirOfertas | TipoTelefono | CodigoPais | Area | Numero |
      | Bogotá  | 12-24-2020   | 1-20-2021   | 1                    | 4               | 1               | 10   | Precio: menor a mayor |           |        |          |       |                |              |            |      |        |

  @manual
  Escenario: Registrarse en Despegar.com
    Dado que diego desea realizar compras de los productos de despegar.com
    Y ingresa a Iniciar sesion no esta registrado
    Cuando selecciona Registrate con un email
    Y ingresa los datos solicitados
      |       Email           |    Contraseña    |
      | pruebas@gmail.com      | Pruebas2019#    |
    Entonces envia un correo para la verificación de la cuenta


  @manual
  Esquema del escenario: Obligatoriedad campos registro de nuevo usuario
    Dado que diego desea realizar compras de los productos de despegar.com
    Y ingresa a Iniciar sesion no esta registrado
    Cuando selecciona Registrate con un email
    Y ingresa los datos solicitados
      |       Email           |    Password     |   Cache   |
      |       <Correo>        |   <password>    |   <Cache> |
    Entonces indica un <mensaje informativo> indicando que es necesario ese campo
    Ejemplos:
      |         Correo          |          Cache            |  password        |      mensaje informativo |
      |                         |         si marcar         |                   |  Este campo es requerido  |
      | pruebas1@gmail.com      |         no marcar         |                   | Eres humano, ¿cierto? Entonces, marca 'No soy un robot'.|
      | pruebas2@gmail.com      |         si marcar         |                   | Este campo es requerido                                 |

  @manual
  Escenario: Realizar reserva de paquete
    Dado que diego requiere un paquete para sus vacaciones en despegar.com
    Cuando ingresa a la opción de paquetes
    Y ingresa la información para la busqueda
      | Opcion de paquete     |    Origen     |     Destino     |         Ida       |  Vuelta          |   Habitaciones  |   Adultos    |   Menores | Edad Menor  |
      | Vuelo + 2 Alojamientos|   Bogotá      |      Cancun     |  4 diciembre 2020 | 10 diciembre 2020|        1        |      2       |        1  |       12    |
    Y realiza los cuatro pasos para la reserva de su paquete
    Entonces le permite visualizar un resumen la reserva que desea comprar



  @manual
  Esquema del escenario: Obligatoriedad de campos para la busquedad
    Dado que diego requiere un paquete para sus vacaciones en despegar.com
    Cuando ingresa a la opción de paquetes
    Y ingresa cierta información para la busqueda
      | Opcion de paquete     |    Origen     |     Destino     |         Ida       |  Vuelta     |   Habitaciones  |   Adultos    |   Menores | Edad Menor  |
      | <Opcion de paquete>|   <Origen>      | <Destino>        |         <Ida>     |  <Vuelta>   |  <Habitaciones> |   <Adultos>  |   <Menores>  | <Edad Menor> |
    Entonces se genera un <Mensaje Informativo> la información que aun falta ingresar
    Ejemplos:
      | Opcion de paquete     |    Origen     |     Destino     |         Ida       |  Vuelta          |   Habitaciones  |   Adultos    |   Menores | Edad Menor  | Mensaje Informativo|
      | Vuelo + 2 Alojamientos|   Bogotá      |                 | 5 diciembre2020   | 10 diciembre 2020|        1        |      2       |        1  |       12    | Ingresa un destino.|
      | Vuelo + 2 Alojamientos|   Bogotá      |   Marruecos     |                   | 10 diciembre 2020|        1        |      2       |        1  |       12    | Ingresa una fecha de partida|
      | Vuelo + 2 Alojamientos|   Bogotá      |                 | 5 diciembre2020   |                  |        1        |      2       |        1  |       12    | Ingresa una fecha de regreso|
      | Vuelo + 2 Alojamientos|   Bogotá      |                 | 5 diciembre2020   | 10 diciembre 2020|        1        |      2       |        1  |             | Ingresa la edad del menor|



  @manual
  Escenario: Realizar reserva de un traslado
    Dado que diego requiere reservar un traslado
    Cuando ingresa a la opción Traslados
    Y ingresa la información para la busqueda
      | Opcion de traslado  |  Desde                                               |   Hasta                                                   |    llegada             |    Adultos   |    Menores    |  Edad menores  |
      | Desde el aeropuerto |  Aeropuerto Mawella Lagoon, Diwan of Royal Court, Omán  |   Mawella Beach Resort Tangalle, Tangalle, Sri Lanka   |   29 septiembre 2020  |       2      |       1       |        10      |
    Entonces se realiza la busqueda del traslado trayendo la información que concuerde con su ingreso



