package servicio;

import entidad.Lavadora;

public class LavadoraService extends ElectrodomesticoService {

    private Lavadora lava;

    public void crearLavadora() {
        crearElectrodomestico();
        this.lava = (Lavadora) this.electro;
        System.out.println("Ingrese la capacidad de carga de la lavadora");
        this.lava.setCarga(sn.nextInt());
    }
    /*
     * Método precioFinal(): este método será heredado y se le sumará la siguiente
     * funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en
     * $500, si la
     * carga es menor o igual, no se incrementará el precio. Este método debe llamar
     * al
     * método padre y añadir el código necesario. Recuerda que las condiciones que
     * hemos
     * visto en la clase Electrodoméstico también deben afectar al precio.
     */

    @Override
    public void precioFinal() {
        this.lava.setPrecio(this.electro.getPrecio());
        if (lava.getCarga() > 30) {
            lava.setCarga(lava.getCarga()+500);
        }
    }
}
