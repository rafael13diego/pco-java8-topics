package herencia;

public class Persona {

    String nombre;
    String fechaNacimiento;


    Persona(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    void dormir(){
        System.out.println("Soy "+nombre+ "y estoy Durmiendo");
    }
    void respirar(){
            System.out.println("Respiro desde: "+fechaNacimiento+ ", jaaa");
    }
    void comiendo(){
            System.out.println(nombre+" está comiendo");
    }



}
