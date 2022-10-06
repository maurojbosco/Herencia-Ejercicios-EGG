package servicio;

import entidad.Electrodomestico;
import entidad.Televisor;

public class TelevisorService extends ElectrodomesticoService {

    private Televisor tele = new Televisor();

    public TelevisorService() {

    }

    public TelevisorService(Electrodomestico electro, Televisor tele) {
        super(electro);
        this.tele = tele;
    }

    public void crearTelevisor() {
        System.out.println("Se va a crear un televisor");
        crearElectrodomestico();
        this.tele.setColor(electro.getColor());
        this.tele.setConsumoEnergetico(electro.getConsumoEnergetico());
        this.tele.setPeso(electro.getPeso());
        this.tele.setPrecio(electro.getPrecio());
        System.out.println("Ingrese el número de pulgadas del Televisor");
        this.tele.setResolucion(sn.nextInt());
        System.out.println("Ingrese la palabra 'ok' si el televisor contiene un sintonizador TDT");
        if (sn.next().equalsIgnoreCase("ok")) {
            this.tele.setSintonizadorTDT(true);
        } else {
            this.tele.setSintonizadorTDT(false);
        }
    }

    // Método que determina el precio final del televisor
    @Override
    public void precioFinal() {
        super.precioFinal();
        this.tele.setPrecio(this.electro.getPrecio());
        if (tele.getResolucion() > 40) {
            tele.setPrecio(tele.getPrecio() + (tele.getPrecio() * 0.3));
        }
        if (tele.isSintonizadorTDT()) {
            tele.setPrecio(tele.getPrecio() + 500);
        }
    }
    //Método que muetra el televisor por pantalla
    public void mostrarTelevisor() {
        System.out.println(tele.toString());
    }

    public double getPrecioTele() {
        return tele.getPrecio();
    }

    @Override
    public String toString() {
        return "TelevisorService [tele=" + tele + "]";
    }

}
