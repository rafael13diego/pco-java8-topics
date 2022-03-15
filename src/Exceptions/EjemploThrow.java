package Exceptions;

public class EjemploThrow {
    // TODO: 4/2/2022 Manejar excepciones será 1 d 2 cosas  -Atrapar excepción try/catch -Programar a quien invocó el método
    /*static double dividir(int a, int b){
        if (b!=0){
            return a/b;
        }else{
            throw new IllegalArgumentException("No se divide entre 0");
        }
    }*/
    static double dividir(int a, int b) throws Exception{
        if (b!=0){
            return a/b;
        }else{
            throw new Exception("No se divide entre 0");
        }
    }

    public static void main(String[] args) throws Exception {
        double resultado = dividir(10,0);
        System.out.println("Resultado %s"+resultado);
    }
}
