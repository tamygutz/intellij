import java.util.ArrayList;
import java.util.List;

public class Colecciones {
    public static void main(String[] args){
        // List -- ArrayList
        //-Los valores se ordenan según el orden en el que los agreguemos
        //-Permiten tener valores duplicados
        //-Es una colección de Objetos de un mismo tipo

        List<String> meses = new ArrayList<String>();

        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        //add() Añade un elemento especificado en el indice especificado
        meses.add(1,"Abril");
        //remove() Elimina el elemento en el indice especificado
        String mes = meses.remove(3);

        System.out.println(meses);
        System.out.println(mes);
        //get() Devuelve el elemento del indice especificado
        System.out.println(meses.get(0));
        //size() Devuelve el número de elementos dentro del arreglo
        System.out.println(meses.size());

        for (String elemento: meses) {
            System.out.println(elemento);
        }

        //Clases Envolventes Wrapper
        int num1 = 10;
        Integer num2 = 10;

        System.out.println(num1 + 10);
        System.out.println(num2 - 5);
        System.out.println(num2.getClass().getSimpleName());

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(588);
        numeros.add(98);
        numeros.add(98);

        System.out.println(numeros);
    }
}
