package Review;
import Review.Animal; //Importamos la clase Animal para poder usarla

public class EjemploAnimal {
    public static void main(String[] args) {

        //Creamos un animal cuyo nombre será Falco
        Animal miAnimal = new Animal("Falco");
        //Le establecemos 3 años de edad a Falco
        miAnimal.setEdad(3);
        //Mostraremos el nombre del animal por pantalla
        System.out.println("El nombre del animal es: " + miAnimal.getNombre());
        //Mostramos la edad del animal por pantalla
        System.out.println("La edad del animal es: " + miAnimal.getEdad());


    }
}
