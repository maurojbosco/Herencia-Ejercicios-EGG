package entidad;

public class Electrodomestico {

    // Atributos
    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    // Constructores
    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    // Getters Y Setters
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    // Método que comprueba que la letra de consumoEnergetico sea correcta
    protected void comprobarConsumoEnergetico(char letra) {
        switch (letra) {
            case 'A':
                this.consumoEnergetico = letra;
                break;
            case 'B':
                this.consumoEnergetico = letra;
                break;
            case 'C':
                this.consumoEnergetico = letra;
                break;
            case 'D':
                this.consumoEnergetico = letra;
                break;
            case 'E':
                this.consumoEnergetico = letra;
                break;
            case 'F':
                this.consumoEnergetico = letra;
                break;
            default:
                this.consumoEnergetico = 'F';
                break;
        }
    }

    // Método que comprueba que el color sea correcto
    protected void comprobarColor(String color) {
        String colorMin = color.toLowerCase();
        switch (colorMin) {
            case "blanco":
                this.color = colorMin;
                break;
            case "negro":
                this.color = colorMin;
                break;
            case "rojo":
                this.color = colorMin;
                break;
            case "azul":
                this.color = colorMin;
                break;
            case "gris":
                this.color = colorMin;
                break;
            default:
                this.color = "blanco";
                break;
        }
    }
}
