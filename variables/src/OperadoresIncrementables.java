public class OperadoresIncrementables {
    public static void main(String[] args) {

        //pre incremento
        int i = 1;

        int j = ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post incremento
        i = 2;

        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }
}
