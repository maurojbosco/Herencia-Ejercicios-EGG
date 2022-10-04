package entidad;

public class Gato extends Animal {
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Soy un gato, me llamo "+ this.nombre +" y me alimento de " + alimento );
        
    }
}
