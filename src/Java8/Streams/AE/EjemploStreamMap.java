package Java8.Streams.AE;

import Java8.Streams.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {

    public static void main(String[] args) {
        /*Stream<String> nombres = Stream
                .of("Pato", "Pepa", "Paco", "Pepe")
                .map(String::toUpperCase);
        nombres.forEach(System.out::println);*/
        //2
        /*Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre =  usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });*/
        //nombres.forEach(System.out::println);
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);


        /*List<String> lista = nombres.collect(Collectors.toList());*/
        //2
        List<Usuario> lista = nombres.collect(Collectors.toList());
        //lista.forEach(System.out::println);

    }
    




}
