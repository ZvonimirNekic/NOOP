package zad_2;

// Sučelje koje definira metode izdavača
public interface PublisherInt {
    void subscribe(SubscriberInt subscriber);         // Dodavanje pretplatnika
    void unsubscribe(SubscriberInt subscriber);       // Uklanjanje pretplatnika
    void notifySubscribers();                         // Obavještavanje pretplatnika
}
