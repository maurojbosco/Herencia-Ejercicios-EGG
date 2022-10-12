package entidad;

import interfaz.calculosFormas;

public class Circulo implements calculosFormas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    
    @Override
    public void calcularArea() {
        System.out.println("El área del círculo es igual a: " + PI * (this.radio * this.radio));

    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del círculo es igual a: " + PI * (this.radio + this.radio));

    }

    
}
