package pckg_adapter2_comic_reader;

public interface BookReader {

    void viewPage(int page) throws PageOutOfRange ;

    void nextPage();

    void previousPage();

    int activePage();

    void goToLastPage();

    void goToFirstPage();

    void zoom(int percentage);

}
