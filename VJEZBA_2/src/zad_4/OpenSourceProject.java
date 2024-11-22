package zad_4;

/*
 * Klasa OpenSourceProject:
 * Implementira funkcionalnosti open-source projekta koristeći Observer dizajn predložak.
 *
 * Funkcionalnosti:
 * 1. Dodavanje suradnika (Observera) na projekt.
 * 2. Uklanjanje suradnika s projekta.
 * 3. Obavještavanje svih suradnika o promjenama koda.
 * 4. Evidencija o opisu promjene, vremenu promjene i autoru.
 */
import java.util.ArrayList;
import java.util.List;

public class OpenSourceProject implements Observable {
    private List<Observer> collaborators = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        collaborators.add(observer);
        System.out.println(observer + " has been added to the project.");
    }

    @Override
    public void removeObserver(Observer observer) {
        collaborators.remove(observer);
        System.out.println(observer + " has been removed from the project.");
    }

    @Override
    public void notifyObservers(String changeDescription, String dateTime, String codeChange, Programmer contributor) {
        for (Observer observer : collaborators) {
            observer.update(changeDescription, dateTime, codeChange, contributor);
        }
    }

    public void makeCodeChange(String changeDescription, String dateTime, String codeChange, Programmer contributor) {
        System.out.println(contributor + " made a change: " + changeDescription);
        notifyObservers(changeDescription, dateTime, codeChange, contributor);
    }
}
