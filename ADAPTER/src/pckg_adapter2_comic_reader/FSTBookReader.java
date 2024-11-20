package pckg_adapter2_comic_reader;

public class FSTBookReader implements BookReader{

    private Book book;
    private int currentPage;
    private int numPages;
    private static final int MAX_P = 150;
    private static final int MIN_P = 50;
    private int zoom;



    public FSTBookReader(){
        System.out.println("Book reader created!");

    }

    public void setBook(Book book){
        this.book = book;
        this.currentPage = 1;
        this.numPages = book.getTotalPages();
        this.zoom = 100;
        System.out.println("Book is set: " + book);
        System.out.println("-----------------------------");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "FSTBookReader{" +
                "book=" + book +
                ", currentPage=" + currentPage +
                ", numPages=" + numPages +
                ", zoom=" + zoom +
                '}';
    }

    @Override
    public void viewPage(int page) throws PageOutOfRange {
        if (book != null){
            if (page <= numPages) {
                this.currentPage = page;
                System.out.println("We are on page " + this.currentPage);
            } else {
                throw new PageOutOfRange();
            }
        } else {
            System.out.println("Book not set!");
        }
    }

    @Override
    public void nextPage() {
        if (book != null){
            if (currentPage < numPages){
                currentPage++;
                System.out.println("Next page -> We are on page " + currentPage);
            } else {
                System.out.println("Next page -> We are on the last page - cannot go to next page");
            }
        } else {
            System.out.println("Book not set!");
        }
    }

    @Override
    public void previousPage() {
        if (book != null){
            if (currentPage > 1){
                currentPage--;
                System.out.println("Previous page -> We are on page " + currentPage);
            } else {
                System.out.println("Previous page -> We are on the first page - cannot go to previous page");
            }
        } else {
            System.out.println("Book not set!");
        }

    }

    @Override
    public int activePage() {
        return currentPage;
    }

    @Override
    public void goToLastPage() {
        if (book != null){
            currentPage = numPages;
            System.out.println("Last page -> We are on page " + currentPage);
        } else {
            System.out.println("Book not set!");
        }

    }

    @Override
    public void goToFirstPage() {
        if (book != null){
            currentPage = 1;
            System.out.println("First page -> We are on page " + currentPage);
        } else {
            System.out.println("Book not set!");
        }

    }

    @Override
    public void zoom(int percentage) {
        if (book != null){
            if (percentage >= MIN_P && percentage <= MAX_P){
                this.zoom = percentage;
                System.out.println("Zoom set to " + this.zoom + "%");
            } else {
                System.out.println("Zoom must be between " + MIN_P + "% and " + MAX_P + "%");
            }
        } else {
            System.out.println("Book not set!");
        }
    }
}
