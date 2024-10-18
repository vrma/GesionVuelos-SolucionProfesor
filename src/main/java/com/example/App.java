package com.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class App {

        private static final int TOTAL_PLAZAS_VUELO_1 = 3;
        private static final int TOTAL_PLAZAS_VUELO_2 = 3;
        private static final int TOTAL_PLAZAS_VUELO_3 = 3;

        public static void main(String[] args) {

                // Se incluyen vuelos a un mismo destino
                List<Vuelo> vuelosMismoDestino = new ArrayList<>();

                // Solucion al punto a). Crear vuelos a tres destinos diferentes.

                Vuelo vuelo1, vuelo2, vuelo3;

                // Listado de Pasajeros del Vuelo 1
                List<Pasajero> pasajerosVuelo1ListaDeEspera = new ArrayList<>();

                Pasajero pasajero1Vuelo1 = Pasajero.builder()
                                .nombre("Ruben")
                                .primerApellido("Gomez")
                                .fechaNacimiento(LocalDate.of(1991, Month.APRIL, 2))
                                .sexo(Sexo.HOMBRE)
                                .build();

                Pasajero pasajero2Vuelo1 = Pasajero.builder()
                                .nombre("Martina")
                                .primerApellido("Gomez")
                                .segundoApellido("Sabio")
                                .fechaNacimiento(LocalDate.of(1990, Month.SEPTEMBER, 2))
                                .sexo(Sexo.MUJER)
                                .build();

                Pasajero pasajero3Vuelo1 = Pasajero.builder()
                                .nombre("Maria")
                                .primerApellido("Sanchez")
                                .segundoApellido("Perez")
                                .fechaNacimiento(LocalDate.of(1994, Month.JULY, 27))
                                .sexo(Sexo.MUJER)
                                .build();

                Pasajero pasajero4Vuelo1 = Pasajero.builder()
                                .nombre("Laura")
                                .primerApellido("Machado")
                                .segundoApellido("Perez")
                                .fechaNacimiento(LocalDate.of(2000, Month.JULY, 25))
                                .sexo(Sexo.MUJER)
                                .build();

                pasajerosVuelo1ListaDeEspera.add(pasajero1Vuelo1);
                pasajerosVuelo1ListaDeEspera.add(pasajero2Vuelo1);
                pasajerosVuelo1ListaDeEspera.add(pasajero3Vuelo1);
                pasajerosVuelo1ListaDeEspera.add(pasajero4Vuelo1);

                // Listado de Pasajeros del Vuelo 2
                List<Pasajero> pasajerosVuelo2ListaDeEspera = new ArrayList<>();

                Pasajero pasajero1Vuelo2 = Pasajero.builder()
                                .nombre("Antonio")
                                .primerApellido("Saez")
                                .segundoApellido("Vagace")
                                .fechaNacimiento(LocalDate.of(1980, Month.FEBRUARY, 25))
                                .sexo(Sexo.HOMBRE)
                                .build();

                Pasajero pasajero2Vuelo2 = Pasajero.builder()
                                .nombre("Susana")
                                .primerApellido("Gomez")
                                .segundoApellido("Sarmiento")
                                .fechaNacimiento(LocalDate.of(1991, Month.SEPTEMBER, 21))
                                .sexo(Sexo.MUJER)
                                .build();

                Pasajero pasajero3Vuelo2 = Pasajero.builder()
                                .nombre("Laura")
                                .primerApellido("Machado")
                                .segundoApellido("Perez")
                                .fechaNacimiento(LocalDate.of(2000, Month.JULY, 25))
                                .sexo(Sexo.MUJER)
                                .build();

                pasajerosVuelo2ListaDeEspera.add(pasajero1Vuelo2);
                pasajerosVuelo2ListaDeEspera.add(pasajero2Vuelo2);
                pasajerosVuelo2ListaDeEspera.add(pasajero3Vuelo2);

                // Listado de Pasajeros del Vuelo 3
                List<Pasajero> pasajerosVuelo3ListaDeEspera = new ArrayList<>();

                Pasajero pasajero1Vuelo3 = Pasajero.builder()
                                .nombre("Mario")
                                .primerApellido("Saez")
                                .segundoApellido("Vagace")
                                .fechaNacimiento(LocalDate.of(1980, Month.FEBRUARY, 25))
                                .sexo(Sexo.HOMBRE)
                                .build();

                Pasajero pasajero2Vuelo3 = Pasajero.builder()
                                .nombre("Antonia")
                                .primerApellido("Gomez")
                                .segundoApellido("Sarmiento")
                                .fechaNacimiento(LocalDate.of(1991, Month.SEPTEMBER, 21))
                                .sexo(Sexo.MUJER)
                                .build();

                pasajerosVuelo3ListaDeEspera.add(pasajero1Vuelo3);
                pasajerosVuelo3ListaDeEspera.add(pasajero2Vuelo3);

                // Creamos los vuelos

                vuelo1 = Vuelo.builder()
                                .destino("Tokio")
                                .precio(699.99)
                                .fechaSalida(LocalDate.of(2024, Month.NOVEMBER, 1))
                                .horaSalida(LocalTime.of(7, 45))
                                .fechaLlegada(LocalDate.of(2024, Month.NOVEMBER, 2))
                                .horaLlegada(LocalTime.of(7, 50))
                                .numeroPlazas(TOTAL_PLAZAS_VUELO_1)
                                .build();

                vuelo2 = Vuelo.builder()
                                .destino("Tokio")
                                .precio(99.99)
                                .fechaSalida(LocalDate.now())
                                .horaSalida(LocalTime.of(7, 45))
                                .fechaLlegada(LocalDate.of(2024, Month.OCTOBER, 18))
                                .horaLlegada(LocalTime.of(9, 50))
                                .numeroPlazas(TOTAL_PLAZAS_VUELO_2)
                                .build();

                vuelo3 = Vuelo.builder()
                                .destino("Roma")
                                .precio(125.99)
                                .fechaSalida(LocalDate.now())
                                .horaSalida(LocalTime.of(19, 0))
                                .fechaLlegada(LocalDate.now())
                                .horaLlegada(LocalTime.of(22, 0))
                                .numeroPlazas(TOTAL_PLAZAS_VUELO_3)
                                .build();

                // Agregar pasajeros al vuelo 1

                List<Pasajero> pasajerosVuelo1ListaDefinitiva = new ArrayList<>();

                pasajerosVuelo1ListaDefinitiva.addAll(pasajerosVuelo1ListaDeEspera.stream()
                                .limit(TOTAL_PLAZAS_VUELO_1).collect(Collectors.toList()));

                // int contadorPasajeros = 0;

                // for (Pasajero pasajero : pasajerosVuelo1ListaDeEspera) {
                // if (contadorPasajeros++ < vuelo1.getNumeroPlazas()) {
                // pasajerosVuelo1ListaDefinitiva.add(pasajero);
                // } else {
                // System.out.println("Vuelo completo, no se admiten mas pasajeros");
                // break;
                // }

                // }

                System.out.println("El total de pasajeros del vuelo 1 es : " +
                                pasajerosVuelo1ListaDefinitiva.size());

                vuelo1.setPasajeros(pasajerosVuelo1ListaDefinitiva);

                // Agregar pasajeros al vuelo 2

                List<Pasajero> pasajerosVuelo2ListaDefinitiva = new ArrayList<>();

                pasajerosVuelo2ListaDefinitiva.addAll(pasajerosVuelo2ListaDeEspera.stream()
                                .limit(TOTAL_PLAZAS_VUELO_2).collect(Collectors.toList()));

                // contadorPasajeros = 0;

                // for (Pasajero pasajero : pasajerosVuelo2ListaDeEspera) {
                // if (contadorPasajeros++ < vuelo2.getNumeroPlazas()) {
                // pasajerosVuelo2ListaDefinitiva.add(pasajero);
                // } else {
                // System.out.println("Vuelo completo, no se admiten mas pasajeros");
                // break;
                // }

                // }
                System.out.println("El total de pasajeros del vuelo 2 es : " +
                                pasajerosVuelo2ListaDefinitiva.size());

                vuelo2.setPasajeros(pasajerosVuelo2ListaDefinitiva);

                // Agregar pasajeros al vuelo 3

                List<Pasajero> pasajerosVuelo3ListaDefinitiva = new ArrayList<>();

                pasajerosVuelo3ListaDefinitiva.addAll(pasajerosVuelo3ListaDeEspera.stream()
                                .limit(TOTAL_PLAZAS_VUELO_3).collect(Collectors.toList()));

                // contadorPasajeros = 0;

                // for (Pasajero pasajero : pasajerosVuelo3ListaDeEspera) {
                // if (contadorPasajeros++ < vuelo3.getNumeroPlazas()) {
                // pasajerosVuelo3ListaDefinitiva.add(pasajero);
                // } else {
                // System.out.println("Vuelo completo, no se admiten mas pasajeros");
                // break;
                // }

                // }
                System.out.println("El total de pasajeros del vuelo 3 es : " +
                                pasajerosVuelo3ListaDefinitiva.size());

                vuelo3.setPasajeros(pasajerosVuelo3ListaDefinitiva);

                // Creamos la lista de Vuelos
                vuelosMismoDestino.add(vuelo1);
                vuelosMismoDestino.add(vuelo2);
                vuelosMismoDestino.add(vuelo3);

                /* Solucion Pto 1 */

                List<Vuelo> vuelosCompletos = vuelosMismoDestino.stream()
                                .filter(vuelo -> vuelo.getPasajeros().size() == vuelo.getNumeroPlazas())
                                .collect(Collectors.toList());

                System.out.println("Total de Vuelos completos " + vuelosCompletos.size());

                /* Solucion al Pto 2. Ejercicio al margen 1 */

                String destinos = vuelosMismoDestino.stream()
                                .filter(vuelo -> vuelo.getFechaSalida().isEqual(LocalDate.now()))
                                .map(Vuelo::getDestino)
                                .collect(Collectors.joining(", "));

                // Comprobar el resultado
                System.out.println("Solucion al punto 2. Ejercicio al margen 1");
                System.out.println(destinos);

                /* Solucion al Pto 2. Ejercicio al margen 1 */

                List<String> listaDestinos = vuelosMismoDestino.stream()
                                .filter(vuelo -> vuelo.getFechaSalida().isEqual(LocalDate.now()))
                                .map(Vuelo::getDestino)
                                .collect(Collectors.toList());

                // Comprobar el resultado
                System.out.println("Solucion al punto 2. Ejercicio al margen 2");
                System.out.println(listaDestinos);


                /* Solucion al Pto 3 */

                List<Vuelo> vuelosMas10Horas = vuelosMismoDestino.stream()
                                .filter(vuelo -> vuelo.getDuracion() > 10)
                                .collect(Collectors.toList());

                System.out.println("Vuelos de mas de 10 horas de duracion " + vuelosMas10Horas);

                /* Solucion al Pto. 4 */
                List<Vuelo> vuelosMas24Horas = vuelosMismoDestino.stream()
                                .filter(vuelo -> vuelo.getDuracion() > 24)
                                .collect(Collectors.toList());

                System.out.println("Vuelos de mas de 24 horas de duracion " + vuelosMas24Horas);

                /* Solucion al Pto 5 */

                // Primero: Recuperar el precio mas alto
                // final Double precioMaximo =
                // vuelosMismoDestino.stream().mapToDouble(Vuelo::getPrecio).max().orElse(0.0);

                // Vuelo vueloPrecioMaximo = vuelosMismoDestino.stream().filter(v ->
                // v.getPrecio() == precioMaximo).findAny().get();

                // System.out.println(vueloPrecioMaximo);

                // Magnifica Solucion de Ivan

                Vuelo vueloMayorPrecio = vuelosMismoDestino.stream()
                                .max(
                                                (Vuelo v1, Vuelo v2) -> Double.valueOf(v1.getPrecio())
                                                                .compareTo(v2.getPrecio()))
                                .get();

                System.out.println("El vuelo con mayor precio es: " + vueloMayorPrecio);

                /* Solucion al Pto. 6 */

                // Primero: Considerando que los vuelos son a destinos diferentes

               
                // Map<String, List<Pasajero>> pasajerosPorDestino = vuelosMismoDestino.stream()
                //                 .collect(Collectors.toMap(Vuelo::getDestino, Vuelo::getPasajeros));

                // System.out.println("PASAJEROS POR DESTINO");
                // System.out.println(pasajerosPorDestino);

                /* Solucion al Pto. 6, considerando vuelos al mismo destino */

                // VARIANTE DE SOLUCION, CON GROUPING BY, Recuperando las listas de pasajeros de cada vuelo
                Map<String, List<List<Pasajero>>> pasajerosPorDestinosRepetidos;

                pasajerosPorDestinosRepetidos = vuelosMismoDestino.stream()
                        .collect(Collectors.groupingBy(Vuelo::getDestino,
                                Collectors.mapping(Vuelo::getPasajeros, 
                                        Collectors.toList())));
                
                // VARIANTE DE SOLUCION, CON GROUPING BY, PERO Aplanando (Flatting) la lista de pasajeros
                // resultante de cad vuelo
                Map<String, List<Pasajero>> pasajerosPorDestinosRepetidosFlatting;

                pasajerosPorDestinosRepetidosFlatting = vuelosMismoDestino.stream()
                        .collect(Collectors.groupingBy(Vuelo::getDestino,
                                Collectors.mapping(Vuelo::getPasajeros, 
                                        Collectors.flatMapping(pasajeros -> pasajeros.stream(), 
                                              Collectors.toList()))));

                // VARIANTE DE SOLUCION UTILIZANDO toMap

                Map<String, List<Pasajero>> pasajerosPorDestinosRepetidosConToMap;

                pasajerosPorDestinosRepetidosConToMap = vuelosMismoDestino.stream()
                        .collect(Collectors.toMap(Vuelo::getDestino, 
                                Vuelo::getPasajeros, (lista1, lista2) -> {
                                        
                                        lista1.addAll(lista2);

                                        return lista1;
                                }));


                /* Solucion al Pto. 7 */

                List<Vuelo> vuelos10DiasAntesMesEnCurso = vuelosMismoDestino.stream()
                                .filter(vuelo -> vuelo.getFechaSalida()
                                                .with(TemporalAdjusters.lastDayOfMonth()).minusDays(10)
                                                .isBefore(vuelo.getFechaSalida()))
                                .collect(Collectors.toList());

                // Mas desglozada la SOLUCION por Ivan (Tener en cuenta que no hay extraer el
                // LocalDate del LocalDateTime, si no es necesario)

                // List<Vuelo> vuelosSalida10AntesFinalizacionMes = listaVuelos.stream()
                // .filter(vuelo -> {
                // LocalDate fechaSalida = LocalDate.of(
                // vuelo.getFechaHoraSalida().getYear(),
                // vuelo.getFechaHoraSalida().getMonth(),
                // vuelo.getFechaHoraSalida().getDayOfMonth());
                // LocalDate fecha10DiasAntes =
                // fechaSalida.with(TemporalAdjusters.lastDayOfMonth()).minusDays(10);
                // return fechaSalida.isAfter(fecha10DiasAntes);
                // })
                // .collect(Collectors.toList());
                // System.out.println("=====EJERCICIO 7=====");
                // System.out.println("Lista de vuelo que salen 10 dias antes de que termine su
                // mes:\n" + vuelosSalida10AntesFinalizacionMes);

                /* Solucion al Pto. 8 */

                Map<Sexo, Map<Long, List<Pasajero>>> pasajerosPorSexoYEdad = vuelosMismoDestino.stream()
                        .map(Vuelo::getPasajeros).flatMap(listaDePasajero -> listaDePasajero.stream())
                                .collect(Collectors.groupingBy(Pasajero::getSexo,
                                                Collectors.groupingBy(Pasajero::getEdad)));

                System.out.println("Pto 8 ...");

                System.out.println(pasajerosPorSexoYEdad);

                /* Solucion al Pto. 9. Ejercicio al margen 3 */

                Map<Sexo, Map<Long, List<Pasajero>>> pasajerosPorSexoYEdadOrdenado;

                pasajerosPorSexoYEdadOrdenado = new TreeMap<>(Collections.reverseOrder());

                pasajerosPorSexoYEdadOrdenado.putAll(pasajerosPorSexoYEdad);

                System.out.println("Ejercicio # 3 ... al margen");
                System.out.println(pasajerosPorSexoYEdadOrdenado);

                /* Ejercicio 4 ... Al margen.
                 * Ordenar el mapa del Pto. 8 por la edad, de mayor a menor
                 */

                System.out.println("EJERCICIO 4 ... al magen, sugerido por Antonio");
                pasajerosPorSexoYEdad.entrySet().forEach(entry1 -> {

                        Map<Long, List<Pasajero>> pasajerosPorEdad = entry1.getValue();

                        Map<Long, List<Pasajero>> pasajerosPorEdadOrdenado;
                        pasajerosPorEdadOrdenado = new TreeMap<>(Collections.reverseOrder());

                        pasajerosPorEdadOrdenado.putAll(pasajerosPorEdad);

                        System.out.println("Pasajeros Ordenados por la Edad, en orden descendente ");

                        System.out.println(pasajerosPorEdadOrdenado);

                });

                /* Solucion al Pto. 10 */

                // VARIANTE # 1. Utilizando el metodo reverseOrder

                System.out.println("Pto 10 ...VARIANTE # 1");

                pasajerosPorSexoYEdad.entrySet().forEach(entry1 -> {
                        System.out.println("Del Sexo: " + entry1.getKey());
                        Map<Long, List<Pasajero>> valor = entry1.getValue();
                        valor.entrySet().forEach(entry2 -> {
                                System.out.println("Y edad " + entry2.getKey());

                                List<Pasajero> pasajeros = entry2.getValue();

                                pasajeros.stream().sorted(Collections
                                        .reverseOrder((p1, p2) -> p1.getPrimerApellido()
                                                    .compareTo(p2.getPrimerApellido()))).forEach(System.out::println);

                        });

                });

                // VARIANTE # 2. Invirtiendo, en el cuerpo de la expresion lambda el orden los objetos persona

                System.out.println("Pto 10 ... VARIANTE # 2");


                pasajerosPorSexoYEdad.entrySet().forEach(entry1 -> {
                        System.out.println("Del Sexo: " + entry1.getKey());
                        Map<Long, List<Pasajero>> valor = entry1.getValue();
                        valor.entrySet().forEach(entry2 -> {
                                System.out.println("Y edad " + entry2.getKey());

                                List<Pasajero> pasajeros = entry2.getValue();

                                pasajeros.stream()
                                      .sorted((p1, p2) -> p2.getPrimerApellido()
                                             .compareTo(p1.getPrimerApellido())).forEach(System.out::println);

                        });


                });

                /* Solucion al Pto. 11 */

                // VARIANTE # 1
                Map<Long, String> nombrePasajeroPorDuracionDelViaje = vuelosMismoDestino.stream()
                        .collect(Collectors.groupingBy(Vuelo::getDuracion, 
                                Collectors.mapping(Vuelo::getPasajeros, 
                                        Collectors.flatMapping(lista -> lista.stream(), 
                                                Collectors.mapping(p -> p.getNombre()
                                                        + " "  + p.getPrimerApellido() 
                                                                  + ( p.getSegundoApellido() != null ? " " + p.getSegundoApellido() : ""),
                                                                        Collectors.joining(";"))))));

                // VARIANTE # 2
                Map<Long, List<String>> nombrePasajeroPorDuracionDelViaje2 = vuelosMismoDestino.stream()
                        .collect(Collectors.groupingBy(Vuelo::getDuracion, 
                                Collectors.mapping(Vuelo::getPasajeros, 
                                        Collectors.flatMapping(lista -> lista.stream(), 
                                                Collectors.mapping(p -> p.getNombre()
                                                        + " "  + p.getPrimerApellido() 
                                                                + (p.getSegundoApellido() != null ? " " + p.getSegundoApellido() : ""),
                                                                        Collectors.toList())))));                                                       

                System.out.println("Solucion al Pto. 11. VARIANTE # 1 ");

                System.out.println(nombrePasajeroPorDuracionDelViaje);

                System.out.println("Solucion al Pto. 11. VARIANTE # 2 ");

                System.out.println(nombrePasajeroPorDuracionDelViaje2);


                /* Solucion al Pto. 12 */

                // Implica crear un mapa que agrupe pasajeros por duracion del viaje, y posteriormente
                // ordenar las claves del mapa, con un TreeMap

                Map<Long, List<Pasajero>> pasajerosPorDuracion = vuelosMismoDestino.stream()
                        .collect(Collectors.groupingBy(Vuelo::getDuracion, 
                                Collectors.mapping(Vuelo::getPasajeros,  
                                        Collectors.flatMapping(lista -> lista.stream(),
                                             Collectors.toList()))));

                Map<Long, List<Pasajero>> pasajerosPorDuracionOrdenado = new TreeMap<>(Comparator.reverseOrder());


                pasajerosPorDuracionOrdenado.putAll(pasajerosPorDuracion);

                System.out.println("Solucion al Pto. 12 ");

                System.out.println(pasajerosPorDuracionOrdenado);


                /* Solucion al Pto. 13 */

                // VARIANTE # 1
                vuelosMismoDestino.stream().forEach(vuelo -> {

                       LocalDate fechaSalida =  vuelo.getFechaSalida();
                       LocalTime horaSalida = vuelo.getHoraSalida();

                       LocalDateTime fechaHoraSalida = LocalDateTime.of(fechaSalida, horaSalida);

                       LocalDateTime fechaHoraActual = LocalDateTime.now();

                       if (fechaHoraSalida.isBefore(fechaHoraActual.plusHours(3)) && fechaHoraSalida.isAfter(fechaHoraActual)) {
                                vuelo.getPasajeros().forEach(pasajero -> System.out.println("Buen viaje:  " + pasajero ));
                       }
                });

                // VARIANTE # 2. Solucion de Ruben
                vuelosMismoDestino.stream()
                        .filter(v -> v.getFechaSalida().atTime(v.getHoraSalida()).isBefore(LocalDateTime.now().plusHours(3)) 
                                && v.getFechaSalida().atTime(v.getHoraSalida()).isAfter(LocalDateTime.now()))
                        .forEach(v -> v.getPasajeros().forEach(pasajero -> System.out.println("Buen viaje:  " + pasajero )));  
                        
                        

                /* Solucion al Pto. 14, Similar al anterior */

                /* Solucion al Pto. 15 */

                // Otro aporte de Ruben y Guerrero, que seria valido
                // si el enum estuviese en Español

                // Map<DayOfWeek, List<Pasajero>> pasajerosPorDia = vuelosMismoDestino.stream()
                //    .collect(Collectors.groupingBy(v -> DayOfWeek.valueOf(v.getFechaSalida().getDayOfWeek()
                //         .getDisplayName(TextStyle.FULL, Locale.of("es", "ES"))), 
                //                 Collectors.mapping(Vuelo::getPasajeros, 
                //                         Collectors.flatMapping(pasajeros -> pasajeros.stream(), 
                //                                Collectors.toList()))));
                                             

                // // Recorrer la coleccion y mostrar el dia en Español
                
                // pasajerosPorDia.entrySet().forEach(entry -> 
                //         System.out.println("Los pasajeros que vuelan el dia " 
                //                 + entry.getKey() + ", son los siguientes: " + "\n\n" + entry.getValue())
                        
                // );

                Map<DayOfWeek, List<Pasajero>> pasajerosPorDia = vuelosMismoDestino.stream()
                   .collect(Collectors.groupingBy(v -> v.getFechaSalida().getDayOfWeek(), 
                                Collectors.mapping(Vuelo::getPasajeros, 
                                        Collectors.flatMapping(pasajeros -> pasajeros.stream(), 
                                               Collectors.toList()))));

                Locale locale = Locale.of("es", "ES");

                pasajerosPorDia.entrySet().forEach(entry -> {
                        DayOfWeek diaDeLaSemana = entry.getKey();

                        System.out.println("Los pasajeros que vuelan el dia " + diaDeLaSemana.getDisplayName(TextStyle.FULL, locale));

                        List<Pasajero> pasajeros  = entry.getValue();

                        pasajeros.stream().forEach(System.out::println);
                });

                /* Solucion al Pto. 16 */

                List<Vuelo> vuelosNoMesEnCurso = vuelosMismoDestino.stream()
                        .filter(v -> ! v.getFechaSalida().getMonth().equals(LocalDate.now().getMonth()))
                        .collect(Collectors.toList());

                vuelosNoMesEnCurso.stream().forEach(v -> {
                        System.out.println("Mes en que salen los vuelos no previstos para el mes en curso");
                        System.out.println(v.getFechaSalida().getMonth().getDisplayName(TextStyle.FULL, locale));
                });







        }
}
