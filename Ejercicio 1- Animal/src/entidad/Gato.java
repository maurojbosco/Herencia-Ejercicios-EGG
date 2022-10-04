package entidad;

public class Gato extends Animal {

    // Constructor
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    // Método del parent modificado
    @Override
    public void Alimentarse() {
        System.out.println("Soy un gato, me llamo " + this.nombre + " y me alimento de " + alimento);

    }
}
