package zad_2;

// Klasa koja predstavlja pretplatnika putem emaila
public class EmailSubscriber implements SubscriberInt {
    private String name;    // Ime pretplatnika
    private String email;   // Email adresa

    public EmailSubscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(String magazineName, String issue) {
        System.out.println("Dear " + name + ", you have received " + magazineName + " " + issue + " to your email: " + email);
    }

    @Override
    public String toString() {
        return "Subscriber [Name=" + name + ", Email=" + email + "]";
    }
}
