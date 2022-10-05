package entidad;

public class Televisor extends Electrodomestico {

    // Atributos
    protected int resolucion;
    protected boolean sintonizadorTDT;

    // Constructores
    public Televisor(int precio, String color, char consumoEnergetico, int peso, int resolucion,
            boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor() {

    }

    // Getters y Setters
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    //To String
    @Override
    public String toString() {
        return "Televisor [precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico
                + ", peso=" + peso + ", resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + "]";
    }
}
