package Java8.Lambdas.Comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PruebaComparator {

    public static void main(String[] args) {

        //NombrePersonaComparator comparator = new NombrePersonaComparator();
        Comparator<Persona> comparator = (Persona p1, Persona p2) -> p1.getApellido().compareTo(p2.getApellido());



        Set<Persona> personas = new TreeSet<>(comparator);
        personas.add(new Persona("Alex", "Bautisata", 32));
        personas.add(new Persona("Juan", "Lopez", 32));
        personas.add(new Persona("Zizu", "Lujan", 32));
        personas.add(new Persona("Adan", "Sanchez", 32));


        System.out.println(personas);
    }

    /*Date hora = new Date();
        System.out.println("La hora es: "+hora);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("la fecha es: "+dtf);


        String timeStamp = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss").format(Calendar.getInstance().getTime());
        String randomNumber = String.valueOf(UUID.randomUUID());
        String randomTime = new SimpleDateFormat("yyyyMMdd-HHmmss").format(Calendar.getInstance().getTime());

        System.out.println(timeStamp);
        System.out.println(randomTime);
        System.out.println("------------");
        System.out.println("numero: "+randomNumber);

        String abc = "abcdefghijklmnño";
        String aa = abc.replace(abc.substring(6,12),"******");

        int tamaño = abc.length();
        System.out.println(tamaño);
        System.out.println("ofuscadoo "+ aa);*/


}
