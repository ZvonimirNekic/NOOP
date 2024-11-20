package pckg_adapter2_comic_reader;

public interface ComicReader {
    // metoda za "skok" na željenu stranicu
    void goToPage(int numPage) throws PageOutOfRange;
    // metoda za prelazak na sljedeću stranicu
    void next();
    // metoda koja daje trenutnu stranicu
    int  currentPage();
    // metoda koja vraća na prethodnu stranicu
    void previous();
    // metoda koja omogućuje direktna prijelaz na posljednju stranicu stripa
    void last();
    // metoda koja omogućuje direktna prijelaz na prvu stranicu stripa
    void first();
    // metoda koja omogućuje zoom in i zoom out u min i max granicama
    void zoom(int percent);
    // metoda koja uključuje / isključuje mod za noćno čitanje
    void nightReadingMode(boolean status);
}
