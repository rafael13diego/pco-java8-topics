package herencia;


//TODO: para usar herencia usar 'Es un?' ejm: perro es unAnimal? sí,  != no sirve para herencia
class Animal{
    String nombre;
    public void respirar(){
        System.out.println("I'm animal and respiro xd "+nombre);
    }
}

class Perro extends Animal{


}

class Gato extends Animal{

}

public class EjemploHerencia {

    public static void main(String[] args){

        Animal a =  new Animal();

        Perro p = new Perro();
        p.nombre="Aladdin";
        p.respirar();
        Gato g = new Gato();
        g.nombre="gato:V";
        g.respirar();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Object);
        System.out.println(a instanceof Gato);

        //TODO: Polimorfismo "Capacidad de objetos de ser identificados como otros"
        System.out.println( p instanceof Animal);
        System.out.println( p instanceof Perro);
    }

}
