package Java8.ClasesJava;

import Java8.ClasesJava.models.Aritmetica;
import Java8.ClasesJava.models.Calculadora;

public class EjemploInterfaceFunctional {

    public static void main(String[] args) {
        //Aritmetica suma  = (a,b) -> a+b;
        Aritmetica suma  = (a, b) -> a+b;
        Aritmetica resta = (a,b) -> a-b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10, 5, suma));
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10, 5, (a,b) -> a*b));

        System.out.println("BI: "+cal.computarConBiFunction(10,5, Double::sum));
    }
}