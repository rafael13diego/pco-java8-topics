package Java8.ClasesJava;


import Java8.ClasesJava.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {

    public static void main(String[] args) {
        Predicate<Integer> test = num -> num >10;
        boolean r = test.test(7);
        System.out.println("r = "+ r);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMI"));

        BiPredicate<String,String> t3 = String::equals; //(a,b) -> a.equals(b);
        System.out.println(t3.test("Diego","Rafael"));

        Usuario a = new Usuario();
        Usuario b = new Usuario();

        a.setNombre("diego");
        b.setNombre("rafael");

        BiPredicate<Usuario, Usuario> t5 =  (ua,ub) -> ua.getNombre().equals(ub);
        System.out.println("Usuarios: "+ t5.test(a,b));

    }
}
