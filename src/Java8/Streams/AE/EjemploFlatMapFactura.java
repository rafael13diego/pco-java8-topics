package Java8.Streams.AE;

import Java8.Streams.models.Factura;
import Java8.Streams.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploFlatMapFactura {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("John", "Ore");
        Usuario u2 = new Usuario("Diego", "Raffol");

        u1.addFactura(new Factura("Compras telefericos"));
        u1.addFactura(new Factura("Compras basicas"));

        u2.addFactura(new Factura("Notebook"));
        u2.addFactura(new Factura("iPad11"));


        List<Usuario> usuarios = Arrays.asList(u1, u2);

        /*usuarios.stream().flatMap(u -> u.getFacturas().stream())
                .forEach(f-> System.out.println(f.getDescripcion().concat("| Cliente : ")
                .concat(f.getUsuario().toString())));*/
        usuarios.stream()
                .map(Usuario::getFacturas)
                .flatMap(List::stream) //Collection
                .forEach(f-> System.out.println(f.getDescripcion().concat("| Cliente : ")
                .concat(f.getUsuario().toString())));

    }
}
