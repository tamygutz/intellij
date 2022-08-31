package principal;

import herencia.BasePadre;
import herencia.Hija;
import herencia.Hijo;

import java.sql.SQLOutput;
import java.util.List;

public class EjemploHerencia {
    public static void main(String[] args) {
        Hija h = new Hija();
        h.visualizarA();
        Hijo ho = new Hijo();
        ho.setA(1566);
        ho.visualizarABC();

        BasePadre obj = new BasePadre();
        obj.setA(2357);

        Object miObj = new BasePadre();



        System.out.println("Atributo de Clase Base Padre "+ obj.getA());
        System.out.println("Atributo de Clase Hijo ---> " + ho.getA());


    }
}