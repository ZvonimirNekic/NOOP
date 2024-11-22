package zad_4;

/*
 * Klasa Programmer:
 * Predstavlja suradnika na open-source projektu koji prima obavijesti o promjenama.
 *
 * Funkcionalnosti:
 * 1. Prikaz informacija o suradniku.
 * 2. Primanje obavijesti o promjenama (update metoda).
 */
public class Programmer implements Observer {
    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void update(String changeDescription, String dateTime, String codeChange, Programmer contributor) {
        System.out.println("--------------------------------------------------");
        System.out.println("Notification for " + name + ":");
        System.out.println("Change: " + changeDescription);
        System.out.println("Date and time: " + dateTime);
        System.out.println("Code change: " + codeChange);
        System.out.println("Author: " + contributor.getName());
        System.out.println("--------------------------------------------------");
    }
}
