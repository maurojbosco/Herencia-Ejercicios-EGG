package entidad;

public class Animal {

    // Atributos
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    // Constructor
    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    // Método a modificar por las clases childs
    public void Alimentarse() {
        System.out.println("Mis clases child me sobreescriben, llamar al método del child correspondiente");
    }

}
