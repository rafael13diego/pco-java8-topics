package polimorfismo.figuras;

public class Circulo extends Figura implements Dibujable{

    private double radio;


    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public void dibujar() {
        System.out.println("se dibuja un circulo");
    }
}
