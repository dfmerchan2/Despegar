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