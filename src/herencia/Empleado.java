package herencia;

public class Empleado extends Persona{

    float sueldo;

    Empleado(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    void trabajar(){
        System.out.println("Soy "+nombre+ "y trabajo");
    }
    void cobrar(){
        System.out.println("Soy "+nombre+ "y cobro: "+sueldo);
    }


}
