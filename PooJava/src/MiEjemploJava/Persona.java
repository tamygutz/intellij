package MiEjemploJava;

public class Persona {
    private String nombre;
    private int edad;
    private int nss;

    public Persona() {

    }

    //Constructores
    public Persona(String nuevonombre, int nuevaedad, int nuevonss) {
        this.nombre = nuevonombre;
        this.edad = nuevaedad;
        this.nss = nuevonss;
    }

    //Accesores
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNss() {
        return nss;
    }


    void caminar() {
        System.out.println("Camina");
    }

    void dormir() {
        System.out.println("Duerme");
    }

}

