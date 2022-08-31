import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {

        //Determinar si una persona es mayor de edad
        // tener la edad - pedir al usuario
        // condicional para saber si es menor de 18

        Scanner escaner = new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        int edad = escaner.nextInt();
        escaner.close();  //Cuando ya no se necesita leer otra cosa


        //No perdamos la bonita costumbre de imprimir all

        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        //Operador ternario
        String resultado = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(resultado);
    }
}
