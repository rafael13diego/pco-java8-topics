package Java8.ClasesJava;


import Java8.ClasesJava.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {

    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha ->  {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + " , tiene " + edad + " años!");

        consumidorBi.accept("Sideral", 33);


        Consumer<String> consumidor2 = System.out::println;

        consumidor2.accept("Hola mundo");

        List<String> nombres  = Arrays.asList("diego","joaquin","rodrigo");
        nombres.forEach(consumidor2);

        Supplier<Usuario> creaUsuario = Usuario::new;
        //Usuario usuario = new Usuario();
        Usuario usuario = creaUsuario.get();

        /*BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> {
          persona.setNombre(nombre);
        };*/
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario,"Andrés");
        System.out.println("Nombre usuario: "+usuario.getNombre());

        //Devuelve un valor
        /*Supplier<String> proveedor = () -> {
            return "Lambda Supplier ";
        };*/
        Supplier<String> proveedor = () -> "Lambda Supplier";
        System.out.println(proveedor.get());

    }
}
