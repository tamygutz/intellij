package MiSaludo;

public class EjemploSaludo {
    public static void main(String[] args) {
    //Puedo referenciar/instanciar lo que contiene el método saludar
        //3 pasos para la instancia
        //1. La declaración
                //2. la construcción
                        //3. la invocación
        Saludo objSaludo;
        objSaludo = new Saludo();
        objSaludo.saludar();

        Saludo objSaludo0 = new Saludo();

        System.out.println(objSaludo.saludar0());
        System.out.println("Este es otro objeto: " + objSaludo0.saludar0());



    }
}
