import java.util.*;

public class Colecciones3 {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        List<String> comidas = new ArrayList<String>();
        comidas.add("Pozole");
        comidas.add("Tostadas");
        comidas.add("Tacos");
        comidas.add("Ceviche");
        comidas.add(2,"Esquite");

        System.out.println(comidas);

        List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        System.out.println(numeros);

        System.out.println("----------------");
        System.out.println("HashSet");


        //Estructura de datos que nos permite guardar información
        Set<String> ciudades = new HashSet<String>();
        ciudades.add("CDMX");
        ciudades.add("GDL");
        ciudades.add("MTY");
        ciudades.add("CNC");

        System.out.println(ciudades);

        //Otra forma de crear un HashSet
        Set<Boolean> verdad = new HashSet<Boolean>(Arrays.asList(true, false, false, true));
        System.out.println(verdad);

        System.out.println("-----------");
        System.out.println("HashMap");

        //Nos permiten guardar pares de valores
        //llave : valor
        //HashMap<Llave, Valor>

        Map<Integer, String> alumnos = new HashMap<Integer, String>();
        alumnos.put(1, "Pedro");
        alumnos.put(2, "Sofia");
        alumnos.put(3, "Salma");
        alumnos.put(4, "Miguel");

        System.out.println(alumnos);
        System.out.println(alumnos.size());
        System.out.println(alumnos.values()); //muestra la lista de valores
        System.out.println(alumnos.keySet()); //muestra la lista de llaves

        Object llaves = alumnos.keySet().toArray()[3];
        System.out.println(alumnos.get(llaves));
        System.out.println(llaves);

        //el método "get" nos devuelve una llave en especifico

        System.out.println(alumnos.get(2));
    }
}
