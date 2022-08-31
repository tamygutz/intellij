import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        System.out.println("Semana");

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        byte diaSemana = sc.nextByte(); //nextByte es un método para leer Bytes

        switch (diaSemana) {

            case 1:
                System.out.println("Se escribio un uno");
                break;
            case 2:
                System.out.println("Se escribio un dos");
                break;
            case 3:
                System.out.println("Se escribio un cuatro");
                break;
            case 4:
                System.out.println("Se escribio un cuatro");
                break;
            default:
                System.out.println("No entendí");
        }
    }
}
