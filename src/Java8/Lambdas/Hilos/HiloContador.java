package Java8.Lambdas.Hilos;

public class HiloContador implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i<=10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.err.println("Problema con el hilo");
            }
        }
    }
}
