package Java8.Streams.AE;

import java.util.ArrayList;
import java.util.List;

public class EjemploStream {

    public static void main(String[] args) {

        //Stream<String> nombres = Stream.of("Paco", "Pato", "Pepa", "Pepe");
        //nombres.forEach(System.out::println);

        //String[] arr = {"pato", "paco", "pepa", "pepe"};
        //nombres = Arrays.stream(arr);
        //nombres.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepe");
        lista.add("Pepa");

        //Stream<String> nombres = lista.stream();
        //nombres.forEach(System.out::println);

        //lista.stream().forEach(System.out::println);
        lista.forEach(System.out::println);

    }
}
