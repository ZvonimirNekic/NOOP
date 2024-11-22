/*
 * Implementacija OldSoftware
 * Svrha: Ispis grafike s dvostrukim proredom koristeći stari softver.
 */
package zad_2;

public class OldSoftwareImplementation implements OldSoftware {
    @Override
    public void plotGraphics(String graphic) {
        System.out.println("Printing with old software:");
        System.out.println(graphic);
    }
}
