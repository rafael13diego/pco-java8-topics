package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PruebaStreams {

    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 10), new Persona("Diego",15),
                new Persona("Oscar", 20), new Persona("Alberto", 6));

        //personas.stream().forEach(System.out::println);

        List<Persona> result = personas.stream().filter(persona -> persona.getEdad() >= 18)
                .limit(3).collect(Collectors.toList());

        System.out.println(result);

    }
}
