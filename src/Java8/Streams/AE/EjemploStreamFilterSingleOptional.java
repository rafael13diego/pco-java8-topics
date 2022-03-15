package Java8.Streams.AE;

import Java8.Streams.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingleOptional {

    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepa"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.println(usuario.get());
        //System.out.println(usuario.orElse(new Usuario("Desconocido", "Unknow")));
        //System.out.println(usuario.orElseGet( () -> new Usuario("Desconocido", "Unknow")).getNombre());
        if (usuario.isPresent()){
        System.out.println(usuario.get());
        }else{
            System.out.println("No se encontro el objeto");
        }

    }
    




}
