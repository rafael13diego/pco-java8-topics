package encapsulamiento;

class Examen{
    private float calificacion =500;
    private int numeroPreguntas =5;
    private boolean activo  = true;

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public int getNumeroPreguntas() {
        return numeroPreguntas;
    }

    public void setNumeroPreguntas(int numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

public class PruebaExamen {
    public static void main(String[] args) {
        Examen p = new Examen();
        System.out.println("Inicio"+p.getCalificacion());
        Examen e = new Examen();
        e.setCalificacion(10.0f);
        System.out.println("final "+e.getCalificacion());

    }
}
