public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;

        boolean b1 = i == j; // igual
        System.out.println("b1 = " + b1);

        boolean b2 = !b1; //not
        System.out.println("b2 = " + b2);

        boolean b3 = i >= j;
        System.out.println("b3 = " + b3);
    }
}
