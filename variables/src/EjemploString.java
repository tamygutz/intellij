import java.sql.SQLOutput;

public class EjemploString {
    public static void main(String[] args) {
        //Declaración literal
        String curso = "Curso en Java";
        System.out.println("curso = " + curso);
        String nombre = "Tamy Gutz";
        //Declaración or referencia
        String resultado = new String("Curso en Java");
        System.out.println("resultado = " + resultado);

        //Estamos comparando como se está declarando
        boolean esigual = curso == resultado;
        System.out.println("esigual " + esigual);

        //Utilizamos equals para comparar el contenido
        esigual = curso.equals(resultado);
        System.out.println("esigual " + esigual);

        String concat = curso +"  "+ nombre;
        System.out.println("concat = " + concat);
        String dia = "Jueves";
        String concat1 = concat.concat(" ").concat(dia);
        System.out.println("concat1= " +concat1);

        //Primero declaramos la variable
        String nuevo;
        //Segundo creamos el objeto
        nuevo = new String();
        //Tercero llamar o instanciar objetos
        System.out.println();
    }
}
