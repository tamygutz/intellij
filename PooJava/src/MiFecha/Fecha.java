package MiFecha;

public class Fecha {

    private int day;
    private  int month;
    private int year;

    //Declara por medio de  un constructor la fecha y la hora


    public Fecha() {
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String formaF(){
        return ""+getDay()+"/"+getMonth()+"/"+getYear();
    }
}
