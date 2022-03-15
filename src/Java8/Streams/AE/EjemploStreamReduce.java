package Java8.Streams.AE;

import java.util.stream.Stream;

public class EjemploStreamReduce {

    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pepa Gutierrez", "Pepa Gutierrez", "Pepa Gutierrez")
                .distinct();
        String resultado = nombres.reduce("Resultado concatenado: ", (a,b) -> a+ "| "+ b);
        System.out.println(resultado);



    }
    




}
