package pckg_adapter2_comic_reader;

public class Comic {

    private String title;
    private String author;
    private int totalPages;


    public Comic(String title, String author, int totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", totalPages=" + totalPages +
                '}';
    }
}
