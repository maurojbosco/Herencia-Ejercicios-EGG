package servicio;

import entidad.Lavadora;

public class LavadoraService extends ElectrodomesticoService {

    private Lavadora lava = new Lavadora();

    public void crearLavadora() {
        System.out.println("Se va a crear una lavadora");
        crearElectrodomestico();
        this.lava.setColor(electro.getColor());
        this.lava.setConsumoEnergetico(electro.getConsumoEnergetico());
        this.lava.setPeso(electro.getPeso());
        this.lava.setPrecio(electro.getPrecio());
        System.out.println("Ingrese la capacidad de carga de la lavadora");
        this.lava.setCarga(sn.nextInt());
    }
    // Método que determina el precio final de la lavadora

    @Override
    public void precioFinal() {
        this.lava.setPrecio(this.electro.getPrecio());
        if (lava.getCarga() > 30) {
            lava.setPrecio(lava.getPrecio() + 500);
        }
    }
    //Método que muestra la Lavadora por pantalla
    public void mostrarLavadora() {
        System.out.println(lava.toString());
    }
}
