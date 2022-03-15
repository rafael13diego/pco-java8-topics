package herencia;

public class Estudiante extends Persona{

    int numeroCuenta;

    Estudiante(int numeroCuenta, String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.numeroCuenta = numeroCuenta;
    }
    //TODO: Sobreescribir método padre "dormir", anotación para sobreescribir

    @Override
    void dormir(){
        super.dormir();
        System.out.println("Soy estudiante y duermo, "+nombre);
    }

    void aprobar(){
        System.out.println("Soy "+nombre+ " y aprobé");
    }
    void reprobar(){
        System.out.println("Soy "+nombre +" y aprobé");
    }


}
