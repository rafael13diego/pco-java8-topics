package Exceptions;

public class EjemploTryCatch {

    public static void main(String[] args) {
        try{
            int x=10;
            int y=10/x;
            System.out.println("Despues del error");
            String n=null;
            System.out.println(n.toString());
            String arr[]={"d","a"};
            System.out.println(arr[3]);
        }catch (ArithmeticException | NullPointerException e){
            System.err.printf("NullPointerException %s \n",e.getMessage());
        }catch (Exception e){
            System.err.printf("Exception %s \n"+e.getMessage());
        }finally{
            System.out.println("Siempre se ejecuta");
        }
    }
}
