package Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class EjemplosStream {


    public static void main(String[] args) {

        //:TODO max - min
        /*List<Integer> numeros = Arrays.asList(50,67,26,14,32,78,31,42,74,62);

        Integer min= numeros.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Mínimos: "+min);
        Optional<Integer>  max= numeros.stream().max(Comparator.naturalOrder());
        System.out.println("Máximos: "+max);*/

        //TODO: Remove duplicate data
        /*List<Integer> numeros = Arrays.asList(50,67,26,50,32,78,67,50,74,67);
        List<Integer> resultado = numeros.stream().distinct().collect(Collectors.toList());
        System.out.println(resultado);

        System.out.println(numeros.stream().collect(Collectors.toSet()));*/

        //TODO: Conversión de data con MAP
    /*List<Persona> personas = Arrays.asList(new Persona("Diego"),new Persona("Joaquin"),new Persona("Rodrigo"));
    List<String> nombres = personas.stream().map(p -> p.getNombre()).collect(Collectors.toList());
        System.out.println(nombres);

    List<Persona> personasList = nombres.stream().map(n -> new Persona(n)).collect(Collectors.toList());
        System.out.println(personasList);*/


    }

}
