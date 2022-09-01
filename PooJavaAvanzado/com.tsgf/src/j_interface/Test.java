package j_interface;

public interface Test {

    int CONV = 8;

    void metodo1(int x);
    void metodo2(String s);
}

//Hay que implementar los métodos que están declarados en el interface
class Prueba implements Test {
    @Override
    public void metodo1(int x) {

    }

    @Override
    public void metodo2(String s) {

    }
}
