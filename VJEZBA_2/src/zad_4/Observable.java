package zad_4;

/*
 * Sučelje Observable:
 * Definira funkcionalnosti potrebne za klasu koja će obavještavati promatrače (Observere).
 *
 * Funkcionalnosti:
 * 1. Dodavanje Observera.
 * 2. Uklanjanje Observera.
 * 3. Obavještavanje svih Observera o promjenama.
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String changeDescription, String dateTime, String codeChange, Programmer contributor);
}
