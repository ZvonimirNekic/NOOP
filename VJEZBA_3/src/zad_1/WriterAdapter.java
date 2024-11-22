package zad_1;

/**
 * WriterAdapter klasa.
 * Svrha: Adapter klasa koja omogućuje da se OldNovelist koristi putem WriterInt sučelja.
 */
public class WriterAdapter implements WriterInt {

    private OldNovelist oldNovelist;

    public WriterAdapter(OldNovelist oldNovelist) {
        this.oldNovelist = oldNovelist;
    }

    @Override
    public void writeNovel(int novelType) {
        // Prilagodba za SF novelu
        if (novelType == 10) {
            oldNovelist.writeSFNovel();
        } else {
            throw new IllegalArgumentException("Invalid novel type for OldNovelist: " + novelType);
        }
    }
}
