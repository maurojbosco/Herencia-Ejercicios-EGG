package entidad;

public class Caballo extends Animal {

    // Constructor
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    //Método del parent modificado
    @Override
    public void Alimentarse() {
        System.out.println("Soy un caballo, me llamo " + this.nombre + " y me alimento de " + alimento);

    }
}
