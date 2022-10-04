package entidad;

public class Perro extends Animal {

    // Constructor
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    // Método del parent modificado
    @Override
    public void Alimentarse() {
        String comida = this.alimento;
        if (this.alimento.equalsIgnoreCase("carnivoro")) {
            comida = "Carne";
        }
        if (this.alimento.equalsIgnoreCase("omnivoro")) {
            comida = "todo tipo de comidas";
        }
        if (this.alimento.equalsIgnoreCase("herbivoro")) {
            comida = "Vegetales";
        }
        System.out.println("Soy un perro, me llamo " + this.nombre + " y me alimento de " + comida);

    }
}
