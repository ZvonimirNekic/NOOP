/*
 * Klasa OldSoftwareAdapter
 * Svrha: Implementira novi softver koristeći stari softver preko adaptera.
 */
package zad_2;

public class OldSoftwareAdapter implements NewSoftware {
    private OldSoftware oldSoftware;

    public OldSoftwareAdapter(OldSoftware oldSoftware) {
        this.oldSoftware = oldSoftware;
    }

    @Override
    public void ispisGrafike(String graphic) {
        // Dodavanje dvostrukog razmaka za stari softver
        StringBuilder sb = new StringBuilder();
        String[] lines = graphic.split("\n");
        for (String line : lines) {
            sb.append(line).append("\n\n");
        }
        String doubleSpacedGraphic = sb.toString();

        // Pozivanje metode starog softvera
        oldSoftware.plotGraphics(doubleSpacedGraphic);
    }
}
