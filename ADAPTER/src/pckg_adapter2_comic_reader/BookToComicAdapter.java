package pckg_adapter2_comic_reader;

public class BookToComicAdapter implements ComicReader {

    private BookReader bookReader;

    public BookToComicAdapter(BookReader bookReader){
        this.bookReader = bookReader;
    }

    @Override
    public void goToPage(int numPage) throws PageOutOfRange {
        bookReader.viewPage(numPage);
    }

    @Override
    public void next() {
        bookReader.nextPage();
    }

    @Override
    public int currentPage() {
        return bookReader.activePage();
    }

    @Override
    public void previous() {
        bookReader.previousPage();

    }

    @Override
    public void last() {
        bookReader.goToLastPage();
    }

    @Override
    public void first() {
        bookReader.goToFirstPage();
    }

    @Override
    public void zoom(int percent) {
        bookReader.zoom(percent);
    }

    @Override
    public void nightReadingMode(boolean status) {
        System.out.println("Sorry, this functionality is not supported!");
    }
}
