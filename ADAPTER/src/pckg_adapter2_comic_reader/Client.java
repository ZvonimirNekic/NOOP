package pckg_adapter2_comic_reader;

public class Client {

    private ComicReader comicReader;

    public Client() {
        System.out.println("Client created - no comic reader set");
    }

    public void setComicReader(ComicReader comicReader) {
        this.comicReader = comicReader;
        System.out.println("Comic reader set");
    }

    public void skipToNextPage() {
        comicReader.next();
    }

    public void skipToPreviousPage() {
        comicReader.previous();
    }

    public void giveMeLastPage() {
        comicReader.last();
    }

    public void giveMeFirstPage() {
        comicReader.first();
    }

    public void setSomeZoom(int perc) {
        comicReader.zoom(perc);
    }

    public void turnNightModeOn() {
        comicReader.nightReadingMode(true);
    }

    public void turnNightModeOff() {
        comicReader.nightReadingMode(false);
    }

    public void giveMePage(int page) {
        try {
            comicReader.goToPage(page);
        } catch (PageOutOfRange e) {
            System.out.println("Page out of range!");
        }
    }

    public void getCurrentPage() {
        System.out.println("Current page: " + comicReader.currentPage());
    }
}
