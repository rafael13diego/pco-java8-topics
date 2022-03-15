package polimorfismo.figuras;

public class PruebaDibujable {

    void probarDibujar( Dibujable dibujable){
        dibujable.dibujar();
    }

    public static void main(String[] args) {
        PruebaDibujable p = new PruebaDibujable();
        p.probarDibujar(new Circulo("verde",5));
        p.probarDibujar(new Rectangulo("azul",5,6));
    }


}
