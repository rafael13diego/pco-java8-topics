package Java8.Streams.AE;

import Java8.Streams.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {

    public static void main(String[] args) {

        boolean usuario = Stream
            .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                    "Pepe Garcia")
            .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
            .peek(System.out::println)
            //.findFirst() Retorna el objeto y anyMatch un boolean
            .anyMatch(u -> u.getId().equals(3));

        //System.out.println(usuario);

    }
    




}
