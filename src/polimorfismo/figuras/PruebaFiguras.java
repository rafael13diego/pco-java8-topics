package polimorfismo.figuras;

/**
TODO: Clases q puedan ser dibujadas, no solo puedas dibujar figuras
 **/

public class PruebaFiguras {

    void imprimirArea(Figura figura){
        System.out.println("El area es: "+figura.calcularArea()
                +" el color es: "+figura.getColor());
    }

    public static void main(String[] args) {
        PruebaFiguras p = new PruebaFiguras();
        p.imprimirArea( new Circulo("rojo",50));
        p.imprimirArea( new Cuadro("verde",5));
        p.imprimirArea( new Rectangulo("amarillo",5,3));

    }

}
