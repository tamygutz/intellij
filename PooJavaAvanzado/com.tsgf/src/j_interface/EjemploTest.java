package j_interface;

public class EjemploTest {
    public static void main(String[] args) {
        System.out.println("Test.CONV = " + Test.CONV);
        System.out.println("Prueba.CONV = " +Prueba.CONV);
        Prueba p = new Prueba();
        System.out.println("p.CONV = " + p.CONV);


        //Instancia de tipo referencia
        //estamos haciendo referencia a ese objeto de Interfaz
        Test t = new Prueba();
        ts.metodo1(3);
        ts.metodo2("Hola");
        ts.metodoPropio();
    }
}
