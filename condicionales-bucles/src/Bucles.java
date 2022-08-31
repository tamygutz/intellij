import java.util.*;  //Importar todas las clases del paquete util

public class Bucles {
    public static void main(String[] args) {
        System.out.println("Bucles");

        for(int i=0; i<10; i++){
            System.out.println(i);
        }

        for(int i=0; i<20; i++){
            System.out.println(i);
        }
        //while
//bucle no controlado


//Mientras la condición sea true
        String condicion = "";
        Scanner sc = new Scanner(System.in);

        while(!Objects.equals(condicion, "Hola")){

            System.out.println("Saludame");
            condicion = sc.next();
        }


    }
}




