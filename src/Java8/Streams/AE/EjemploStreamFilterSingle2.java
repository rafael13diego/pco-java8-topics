package Java8.Streams.AE;

import Java8.Streams.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {

    public static void main(String[] args) {

        Usuario usuario = Stream
            .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                    "Pepe Garcia")
            .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
            .peek(System.out::println)
            .filter(u -> u.getId().equals(4))
            .findFirst().orElseGet(() -> new Usuario("Desconocido", "Unknow"));

        System.out.println(usuario);

    }
    




}
