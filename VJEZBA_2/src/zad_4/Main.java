package zad_4;

/*
 * ZADATAK:
 * Kreirati aplikaciju koja omogućuje suradnju više programera na jednom
 * open-source projektu uz pomoć Observer dizajn predloška.
 *
 * Funkcionalnosti:
 * 1. Dodavanje suradnika na projekt.
 * 2. Uklanjanje suradnika iz projekta.
 * 3. Obavještavanje svih suradnika o promjenama koda.
 * 4. Evidencija o autoru promjene, vremenu promjene i opisu promjene.
 */
public class Main {

    public static void main(String[] args) {
        // Kreiranje projekta
        OpenSourceProject project = new OpenSourceProject();

        // Dodavanje suradnika
        Programmer programmer1 = new Programmer("Programmer 1");
        Programmer programmer2 = new Programmer("Programmer 2");

        project.addObserver(programmer1);
        project.addObserver(programmer2);

        // Promjena u projektu
        project.makeCodeChange("Initial setup", "2024-11-22 10:00",
                "public void setup() { /* Initial code */ }", programmer1);

        // Uklanjanje suradnika
        project.removeObserver(programmer1);

        // Nova promjena
        project.makeCodeChange("Bug fix", "2024-11-22 11:00",
                "public void bugFix() { /* Fixes a bug */ }", programmer2);
    }
}
