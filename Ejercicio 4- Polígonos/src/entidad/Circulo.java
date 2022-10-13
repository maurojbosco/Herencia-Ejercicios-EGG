package entidad;

public class Circulo {

    // Atributo
    private double radio;

    // Constructores
    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    // Setters y Getters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // To String
    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

}
