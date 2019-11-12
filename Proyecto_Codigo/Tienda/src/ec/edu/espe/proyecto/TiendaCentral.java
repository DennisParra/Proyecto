
package ec.edu.espe.proyecto;

import static ec.edu.espe.proyecto.Tienda.menuEntrada;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TiendaCentral {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        ArrayList<Tienda> productos = new ArrayList<>();
 
        menuEntrada(productos);
 
    }
}
