package zad_2;

import java.util.ArrayList;
import java.util.List;

// Apstraktna klasa koja implementira PublisherInt
public abstract class MagazinePublisher implements PublisherInt {
    protected String magazineName;                   // Naziv časopisa
    protected String periodicity;                    // Periodičnost izlaženja
    protected List<SubscriberInt> subscribers;       // Lista pretplatnika
    protected int currentIssue;                      // Trenutni broj izdanja

    public MagazinePublisher(String magazineName, String periodicity) {
        this.magazineName = magazineName;
        this.periodicity = periodicity;
        this.subscribers = new ArrayList<>();
        this.currentIssue = 1;
    }

    @Override
    public void subscribe(SubscriberInt subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber + " has subscribed to " + magazineName);
    }

    @Override
    public void unsubscribe(SubscriberInt subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber + " has unsubscribed from " + magazineName);
    }

    @Override
    public void notifySubscribers() {
        for (SubscriberInt subscriber : subscribers) {
            subscriber.update(magazineName, "Issue #" + currentIssue);
        }
    }

    // Metoda za objavljivanje novog izdanja
    public void publishNewIssue() {
        System.out.println("\nPublishing " + magazineName + " " + "Issue #" + currentIssue);
        notifySubscribers();
        currentIssue++;
    }

    @Override
    public String toString() {
        return magazineName + " (" + periodicity + ")";
    }
}
