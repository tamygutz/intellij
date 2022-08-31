import java.util.Scanner;

public class OperadoresAritméticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println(suma);

        System.out.println("i + j = " + (i + j));

        int multi = i * j;
        System.out.println(multi);
        System.out.println("i + j = " + (i * j));

        int resto = i % j;
        System.out.println(resto);
        System.out.println("resto = " + (i % j));

        Scanner scanner = new Scanner(System.in);
    }
}
