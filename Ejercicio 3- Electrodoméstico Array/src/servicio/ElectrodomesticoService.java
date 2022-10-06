package servicio;

import entidad.Electrodomestico;

import java.util.Scanner;

public class ElectrodomesticoService {
    protected Electrodomestico electro = new Electrodomestico();
    protected Scanner sn = new Scanner(System.in);
    

    public ElectrodomesticoService() {
    }

    public ElectrodomesticoService(Electrodomestico electro) {
        this.electro = electro;
    }

    // Método que crea un elecrtrodoméstico pidiendo los datos por teclado
    public void crearElectrodomestico() {
        System.out.println("Ingrese el color del electrodoméstico");
        String color = sn.next();
        this.electro.setColor(color);
        System.out.println("Ingrese el tipo de consumo energético");
        this.electro.setConsumoEnergetico(sn.next().charAt(0));
        System.out.println("Ingrese el peso del electrodoméstico");
        this.electro.setPeso(sn.nextInt());
        this.electro.setPrecio(1000);
    }

    // Método que aumenta el precio del elecrtrodoméstico segun el peso y el consumo
    // del mismo
    public void precioFinal() {
        switch (this.electro.getConsumoEnergetico()) {
            case 'A':
                this.electro.setPrecio(this.electro.getPrecio() + 1000);
                break;
            case 'B':
                this.electro.setPrecio(this.electro.getPrecio() + 800);
                break;
            case 'C':
                this.electro.setPrecio(this.electro.getPrecio() + 600);
                break;
            case 'D':
                this.electro.setPrecio(this.electro.getPrecio() + 500);
                break;
            case 'E':
                this.electro.setPrecio(this.electro.getPrecio() + 300);
                break;
            case 'F':
                this.electro.setPrecio(this.electro.getPrecio() + 100);
                break;
        }
        if (this.electro.getPeso() >= 1 && this.electro.getPeso() <= 19) {
            this.electro.setPeso(this.electro.getPeso() + 100);
        } else if (this.electro.getPeso() >= 20 && this.electro.getPeso() <= 49) {
            this.electro.setPeso(this.electro.getPeso() + 500);
        } else if (this.electro.getPeso() >= 50 && this.electro.getPeso() <= 79) {
            this.electro.setPeso(this.electro.getPeso() + 800);
        } else if (this.electro.getPeso() >= 80) {
            this.electro.setPeso(this.electro.getPeso() + 1000);
        }
    }
}
