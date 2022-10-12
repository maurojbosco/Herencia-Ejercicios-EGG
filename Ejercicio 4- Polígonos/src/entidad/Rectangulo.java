package entidad;

import interfaz.calculosFormas;

public class Rectangulo implements calculosFormas {

    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + "]";
    }

    @Override
    public void calcularArea() {
        System.out.println("EL área del rectángulo es igual a: " + this.base * this.altura);

    }

    @Override
    public void calcularPerimetro() {
        System.out.println("EL perímetro del rectángulo es igual a: " + (this.base + this.altura) * 2);

    }
    
}
