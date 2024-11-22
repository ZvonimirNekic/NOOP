package zad_1;

/**
 * NovelWriter klasa.
 * Svrha: Implementira WriterInt sučelje za pisanje različitih vrsta novela.
 */
public class NovelWriter implements WriterInt {

    private String writer;

    public NovelWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public void writeNovel(int novelType) {
        switch (novelType) {
            case 1:
                System.out.println(writer + " writing a history novel...");
                break;
            case 2:
                System.out.println(writer + " writing a thriller novel...");
                break;
            case 3:
                System.out.println(writer + " writing a romantic novel...");
                break;
            default:
                throw new IllegalArgumentException("Invalid novel type: " + novelType);
        }
        System.out.println(toString());
        System.out.println("****************************************");
    }

    @Override
    public String toString() {
        return "NovelWriter [writer=" + writer + "]";
    }
}
