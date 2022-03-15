package Java8.Streams.AE;

import Java8.Streams.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {

    public static void main(String[] args) {

        long count = Stream
            .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                    "Pepe Garcia")
            .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
            .peek(System.out::println)
            //.findFirst() Retorna el objeto y anyMatch un boolean
            .count();
        System.out.println(count);

    }
    




}
