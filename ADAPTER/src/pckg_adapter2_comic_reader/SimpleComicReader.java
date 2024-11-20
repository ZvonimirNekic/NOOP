package pckg_adapter2_comic_reader;

public class SimpleComicReader implements ComicReader {

    private Comic comic;
    private int currentPage;
    private int totalPages;
    private static final int MAXPERCENT = 200;
    private static final int MINPERCENT = 20;
    private int zoomLevel;
    private boolean nightReading;

    public SimpleComicReader(){
        System.out.println("Ready to read some comics...");
        System.out.println("Please provide some comic to read");
        nightReading = false;
    }



    public void setComic(Comic comic) {
        this.comic = comic;
        this.currentPage = 1;
        totalPages = comic.getTotalPages();
        zoomLevel = 100;
        System.out.println("Comic is set: ");
        System.out.println(comic);
        System.out.println("-----------------------------");
        System.out.println(this);

    }


    @Override
    public void goToPage(int numPage) throws PageOutOfRange {
        if (comic != null){
            if (numPage <= totalPages){
                this.currentPage = numPage;
                System.out.println("We are on page " + this.currentPage);
            } else {
                throw new PageOutOfRange();
            }
        } else {
            System.out.println("Comic not set!");
        }
    }

    @Override
    public void next() {
        if (comic != null){
            if (currentPage < totalPages){
                currentPage++;
                System.out.println("Next page -> We are on page " + currentPage);
            } else {
                System.out.println("Next page -> We are on the last page - cannot go to next page");
            }
        } else {
            System.out.println("Comic not set!");
        }
    }

    @Override
    public int currentPage() {
        return currentPage;
    }

    @Override
    public void previous() {
        if (comic != null){
            if (currentPage > 1){
                currentPage--;
                System.out.println("Previous page -> We are on page " + currentPage);
            } else {
                System.out.println("Previous page -> We are on the first page - cannot go to previous page");
            }
        } else {
            System.out.println("Comic not set!");
        }

    }

    @Override
    public void last() {
        if (comic != null){
            currentPage = totalPages;
            System.out.println("Last page -> We are on page " + currentPage);
        } else {
            System.out.println("Comic not set!");
        }

    }

    @Override
    public void first() {
        if (comic != null){
            currentPage = 1;
            System.out.println("First page -> We are on page " + currentPage);
        } else {
            System.out.println("Comic not set!");
        }

    }

    @Override
    public void zoom(int percent) {
        if (comic != null){
            if (percent >= MINPERCENT && percent <= MAXPERCENT){
                System.out.println("Zoom level is set to " + percent + "%");
            } else {
                System.out.println("Zoom level must be between " + MINPERCENT + "% and " + MAXPERCENT + "%");
            }
        } else {
            System.out.println("Comic not set!");
        }

    }

    @Override
    public void nightReadingMode(boolean status) {
        if (comic != null){
            if (status){
                System.out.println("Night reading mode is ON");
                nightReading = true;
            } else {
                System.out.println("Night reading mode is OFF");
                nightReading = false;
            }
        } else {
            System.out.println("Comic not set!");
        }

    }

    @Override
    public String toString() {
        return "SimpleComicReader{" +
                "comic=" + comic +
                ", currentPage=" + currentPage +
                ", totalPages=" + totalPages +
                ", zoomLevel=" + zoomLevel +
                ", nightReading=" + nightReading +
                '}';
    }
}
