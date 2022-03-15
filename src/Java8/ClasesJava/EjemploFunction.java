package Java8.ClasesJava;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "Hola que tal! "+ param;
        String resultado = f1.apply("Diego");
        System.out.println(resultado);

        //Function<String, String> f2 = param -> param.toUpperCase();
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("Diegoo"));

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("Diego", "Rafael");
        System.out.println(r2);
    }
}
