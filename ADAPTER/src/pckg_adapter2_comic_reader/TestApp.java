package pckg_adapter2_comic_reader;

public class TestApp {
    public static void main(String[] args) {
        Comic comic = new Comic("Captain America", "Jack Kirby", 100);
        SimpleComicReader comicReader = new SimpleComicReader();
        comicReader.setComic(comic);
        Client client = new Client();
        client.setComicReader(comicReader);
        client.skipToNextPage();
        client.giveMePage(99);
        client.turnNightModeOn();

        Book book = new Book("The last principle", "A.G. Marty", 230);
        FSTBookReader bookReader = new FSTBookReader();
        bookReader.setBook(book);
        BookToComicAdapter adapter = new BookToComicAdapter(bookReader);

        client.setComicReader(adapter);
        client.turnNightModeOff();

    }
}
