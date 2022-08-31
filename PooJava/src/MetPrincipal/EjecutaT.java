package MetPrincipal;

import MiEjemploJava.Persona;
import MiFecha.Fecha;
import MiSaludo.Saludo;
import Review.Animal;

import java.util.Scanner;

public class EjecutaT {
    public static void main(String[] args) {
        //Agrego un escaner para pedir que el usuario escriba el número
        Scanner sc = new Scanner(System.in);

        //Mandarle la leyenda que introduzca su opción
        System.out.println("Introduzca su opción: ");

        //Encapsulación
        //Como acceder a una clase encapsulada
        MenuOp menuOp = new MenuOp();
        menuOp.menu();

        //La entrada de datos debo de darsela a la opción op
        int op = sc.nextInt();

        do{

            System.out.println("Introduzca su opción: ");
            menuOp.menu();


            switch (op) {
                case 1 -> {
                    Saludo s = new Saludo();
                    s.saludar();
                    System.out.println(s.saludar0());
                }
                case 2 -> {
                    Persona p = new Persona("Juan", 23, 2357);
                    System.out.println("el valor de la variable de instancia p.nombre -> " + p.getNombre());
                }
                case 3 -> {
                    Fecha ObjDate = new Fecha();
                    ObjDate.setDay(25);
                    ObjDate.setMonth(8);
                    ObjDate.setYear(2022);
                    System.out.println("La fecha de hoy es: " + ObjDate.getDay() + "/" + ObjDate.getMonth() + "/" + ObjDate.getYear());
                    System.out.println(ObjDate.formaF());
                }
                case 4 -> {
                    Animal miAnimal = new Animal("Falco");
                    miAnimal.setEdad(3);
                    System.out.println("El nombre del animal es: " + miAnimal.getNombre());
                    System.out.println("La edad del animal es: " + miAnimal.getEdad());
                }
                default -> System.out.println("Opcion no valida");
            }
        } while (sc.nextInt() <= 5);


    }
}
