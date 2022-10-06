import java.util.ArrayList;
import java.util.List;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import servicio.ElectrodomesticoService;
import servicio.LavadoraService;
import servicio.TelevisorService;


/*Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos 
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se 
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del 
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para 
electrodomésticos, 2000 para lavadora y 5000 para televisor. */

public class App {
    public static void main(String[] args) {
       /*  LavadoraService lavadora = new LavadoraService();
        TelevisorService televisor = new TelevisorService();
        lavadora.crearLavadora();
        televisor.crearTelevisor();
        lavadora.precioFinal();
        televisor.precioFinal();
        lavadora.mostrarLavadora();
        televisor.mostrarTelevisor();*/

        List<Electrodomestico> listaElectro = new ArrayList<>();

        listaElectro.add(new Televisor(30000, "rojo", 'A', 43, 41, true));
        listaElectro.add(new Televisor(10000, "ocre", 'Z', 26, 32, false));
        listaElectro.add(new Lavadora(12000,"azul", 'B', 43, 22  ));
        listaElectro.add(new Lavadora(8000,"negro", 'F', 25, 14  ));
        
        double sumTele = 0;
        double sumLava = 0;
        for (Electrodomestico electrodomestico : listaElectro) {
            if (electrodomestico instanceof Lavadora) {
                LavadoraService elec = new LavadoraService(electrodomestico, (Lavadora)electrodomestico);
                elec.precioFinal();
                sumLava += elec.getPrecioLava();
                System.out.println(elec.toString());
            }
            if (electrodomestico instanceof Televisor) {
                TelevisorService elec = new TelevisorService(electrodomestico, (Televisor)electrodomestico);
                elec.precioFinal();
                sumTele += elec.getPrecioTele();
                System.out.println(elec.toString());
            }
        }
        System.out.println("La suma del precio de los televisores es $ "+ sumTele);
        System.out.println("La suma del precio de las lavadoras es $ "+ sumLava);

        System.out.println("La suma del precio de todos los electrodomésticos es $ "+ (sumLava+sumTele));

    }
}
