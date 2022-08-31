package h_abstracta;

public class Circulo extends FigurasGeometricas {
    private double radio;
    @Override
    public float area() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
