package zad_2;

/*
 * Zadatak 2:
 * Primjenom predloška Observer riješite problem pretplate na dva različita časopisa
 * od kojih jedan izlazi mjesečno, a drugi kvartalno. Svaki put kada iziđe novi broj
 * izdavač šalje e-verziju časopisa (npr. PDF verziju) pretplatnicima na njihovu mail adresu.
 * Simulirajte dodavanje novih pretplatnika, kao i prestanak pretplate za nekoliko pretplatnika.
 */

public class App {
    public static void main(String[] args) {
        // Kreiranje izdavača
        MonthlyMagazine monthlyMagazine = new MonthlyMagazine("Tech Monthly");
        QuarterlyMagazine quarterlyMagazine = new QuarterlyMagazine("Science Quarterly");

        // Kreiranje pretplatnika
        EmailSubscriber subscriber1 = new EmailSubscriber("Ana", "ana@example.com");
        EmailSubscriber subscriber2 = new EmailSubscriber("Ivan", "ivan@example.com");
        EmailSubscriber subscriber3 = new EmailSubscriber("Marko", "marko@example.com");

        // Pretplatnici se pretplaćuju na časopise
        monthlyMagazine.subscribe(subscriber1);
        monthlyMagazine.subscribe(subscriber2);

        quarterlyMagazine.subscribe(subscriber2);
        quarterlyMagazine.subscribe(subscriber3);

        // Objavljivanje novih izdanja
        monthlyMagazine.publishNewIssue();
        quarterlyMagazine.publishNewIssue();

        // Pretplatnik se odjavljuje
        monthlyMagazine.unsubscribe(subscriber2);

        // Objavljivanje novih izdanja
        monthlyMagazine.publishNewIssue();
        quarterlyMagazine.publishNewIssue();
    }
}
