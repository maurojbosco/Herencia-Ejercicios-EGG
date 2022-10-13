package servicio;

import java.util.Scanner;

import entidad.Rectangulo;
import interfaz.calculosFormas;

public class RectanguloService implements calculosFormas {

    Rectangulo recta = new Rectangulo();
    private Scanner sn = new Scanner(System.in);

    public void crearRectangulo() {
        System.out.println("Introduzca la base del rectángulo ");
        recta.setBase(sn.nextDouble());
        System.out.println("Introduzca la altura del rectángulo");
        recta.setAltura(sn.nextDouble());
    }

    @Override
    public void calcularArea() {
        System.out.println("EL área del rectángulo es igual a: " + recta.getBase() * recta.getAltura());

    }

    @Override
    public void calcularPerimetro() {
        System.out.println("EL perímetro del rectángulo es igual a: " + (recta.getBase() + recta.getAltura()) * 2);

    }
}
