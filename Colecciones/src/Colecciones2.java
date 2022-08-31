import java.util.HashSet;
import java.util.Set;

public class Colecciones2 {
    public static void main(String[] args) {
        //SET
        //HashSet
        //-No guardan los valores en el orden en que fueron agregados
        //-SET no permite elementos duplicados
        //-La colección que funciona más rapido.

        Set<String> miSet = new HashSet<>();

        miSet.add("Juan");
        miSet.add("Pedro");
        miSet.add("Luis");
        miSet.add("Felipe");
        miSet.add("Felipe");
        miSet.add("Felipe");
        miSet.add("Felipe");
        miSet.add("Felipe");

        miSet.remove("Felipe");

        System.out.println(miSet);
        System.out.println(miSet.size());
        //contains() Se pregunta si el elmento especificado se encuentra dentro del arreglo y devuelve true o false
        System.out.println(miSet.contains("Juan"));

        for (String nombre : miSet) {
            System.out.println(nombre);

        }
    }
}
