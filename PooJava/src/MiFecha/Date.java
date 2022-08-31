package MiFecha;

public class Date {
    public static void main(String[] args) {
        Fecha ObjDate = new Fecha();
        ObjDate.setDay(25);
        ObjDate.setMonth(8);
        ObjDate.setYear(2022);

        System.out.println("La fecha de hoy es: " + ObjDate.getDay() +"/" + ObjDate.getMonth() + "/" + ObjDate.getYear());
        System.out.println(ObjDate.formaF());

    }
}
