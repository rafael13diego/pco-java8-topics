package herencia;

import herencia.Empleado;
import herencia.Estudiante;

public class EjemploPersonas {
    public static void main(String[] args) {


        Estudiante estudiante = new Estudiante(101010, "Alex,", "10-15-2020");
        estudiante.dormir();
        estudiante.aprobar();
        estudiante.respirar();
        estudiante.reprobar();


        /*Empleado empleado = new Empleado();
        empleado.nombre="Sideral";
        empleado.sueldo=1515;
        empleado.comiendo();
        empleado.cobrar();*/


    }
}
