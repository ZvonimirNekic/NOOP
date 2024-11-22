package zad_1;

/**
 * AppCli klasa.
 * Svrha: Glavna klasa koja demonstrira funkcionalnosti implementiranih klasa.
 */
public class AppCli {
    public static void main(String[] args) {
        // Demonstracija NovelWriter funkcionalnosti
        NovelWriter novelWriter = new NovelWriter("Famous novel writer");
        novelWriter.writeNovel(1); // History novel
        novelWriter.writeNovel(3); // Romantic novel

        // Demonstracija OldNovelist funkcionalnosti kroz adapter
        WriterAdapter writerAdapter = new WriterAdapter(new OldNovelist("SF novelist"));
        writerAdapter.writeNovel(10); // SF novel
    }
}
