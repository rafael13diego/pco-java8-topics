package Java8.Lambdas.Comparator;

public class Persona {

    private String nombre;
    private String apellido;
    private Integer edad;

    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String maskCardNumber(String ccnum){



        int total = ccnum.length();
        int startlen = 2;
        int endlen = 2;
        int masklen = total - (startlen + endlen);
        String maskedbuf = ccnum.substring(0, startlen);
        for (int i = 0; i < masklen; i++) {
            maskedbuf = maskedbuf.concat("*");
        }
        return maskedbuf.concat(ccnum.substring(startlen + masklen, total));
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }


}
