package Java8.Lambdas.Optional;

import java.util.Optional;

public class PruebaOptional {


    private static String[] nombres = {"Alex", "Diego", "Joaco", "Rodri"};

    public static Optional<String> buscarPorNombre(String n) {
        for (String nombre : nombres) {
            if (nombre.equals(n)) {
                return Optional.of(nombre);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> result = buscarPorNombre("Pedro");
        if (result.isPresent()) {
            System.out.println(result.get().toUpperCase());
        } else {
            System.out.println("No se encontró");
        }

        String nombre = buscarPorNombre("Pedrito").orElse("Nombre Default");
        System.out.println(nombre);

        String value = buscarPorNombre("Diego").orElseThrow(() -> new IllegalStateException("No se encontró el nombre"));
        System.out.println(value);

    }

}
