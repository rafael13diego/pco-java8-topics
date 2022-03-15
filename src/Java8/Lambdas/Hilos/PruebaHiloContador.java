package Java8.Lambdas.Hilos;

public class PruebaHiloContador {
    public static void main(String[] args) {
        Thread hilo = new Thread(new HiloContador());
        hilo.start();

        Runnable runnable2 = () ->{
            for (int i = 0; i<=10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.err.println("Problema con el hilo");
                }
            }
        };

        Thread hilo2 = new Thread(runnable2);
        hilo2.start();
    }
}
