package servicio;

import java.util.Scanner;

import entidad.Circulo;
import interfaz.calculosFormas;

public class CirculoService implements calculosFormas {

    Circulo circu = new Circulo();
    private Scanner sn = new Scanner(System.in);

    public void crearCirculo() {
        System.out.println("Introduzca el tamaño del radio del círculo ");
        circu.setRadio(sn.nextDouble());
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del círculo es igual a: " + PI * (circu.getRadio() * circu.getRadio()));

    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del círculo es igual a: " + PI * (circu.getRadio() + circu.getRadio()));

    }

}
