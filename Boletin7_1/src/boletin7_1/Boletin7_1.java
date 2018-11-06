

package boletin7_1;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin7_1 {

 
    public static void main(String[] args) {
       Libro librillo = new Libro("Fornite", "Epic Games", 300);
        System.out.println(librillo.toString());
        librillo.prestamo();
        System.out.println(librillo.toString());
        librillo.devolucion();
        System.out.println(librillo.toString());
    }
    
}

