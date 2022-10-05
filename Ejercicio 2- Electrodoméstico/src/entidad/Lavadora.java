package entidad;

public class Lavadora extends Electrodomestico {

    //Atributo
    protected int carga;

    //Constuctores
    public Lavadora(int precio, String color, char consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    public Lavadora(){

    }

    //Getter y Setters
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
