
package zad_2;

/*
 * ZADATAK:
 * Realizirati adapter između starog i novog softvera za ispis grafike.
 * Novi softver koristi metodu `ispisGrafike`, dok stari softver koristi metodu `plotGraphics`.
 * Rješenje treba omogućiti starom softveru da radi unutar novog sustava pomoću adaptera.
 * Demonstrirati funkcionalnost koristeći ispis novog softvera i adaptera.
 */
public class App {
    public static void main(String[] args) {
        OldSoftware oldSoftware = new OldSoftwareImplementation();
        NewSoftware newSoftware = new NewSoftwareImplementation();

        // Adapter za stari softver
        NewSoftware oldSoftwareAdapter = new OldSoftwareAdapter(oldSoftware);

        // Testni ispis
        String graphic = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\nVivamus lacinia odio vitae vestibulum vestibulum.";
        System.out.println("Using new software:");
        newSoftware.ispisGrafike(graphic);

        System.out.println("\nUsing old software via adapter:");
        oldSoftwareAdapter.ispisGrafike(graphic);
    }
}
