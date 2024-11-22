package zad_4;

/*
 * Sučelje Observer:
 * Definira metodu za primanje obavijesti o promjenama.
 *
 * Funkcionalnosti:
 * 1. Metoda update koja prima informacije o promjenama.
 */
public interface Observer {
    void update(String changeDescription, String dateTime, String codeChange, Programmer contributor);
}
