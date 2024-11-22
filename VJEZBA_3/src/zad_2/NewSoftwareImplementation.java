/*
 * Implementacija NewSoftware
 * Svrha: Ispis grafike koristeći novi softver.
 */
package zad_2;

public class NewSoftwareImplementation implements NewSoftware {
    @Override
    public void ispisGrafike(String graphic) {
        System.out.println("Printing with new software:");
        System.out.println(graphic);
    }
}
