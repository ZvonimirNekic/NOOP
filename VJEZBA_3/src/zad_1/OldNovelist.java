package zad_1;

/**
 * OldNovelist klasa.
 * Svrha: Implementira stariji dizajn za pisanje SF novela.
 */
public class OldNovelist {

    private String name;

    public OldNovelist(String name) {
        this.name = name;
    }

    public void writeSFNovel() {
        System.out.println(name + " writing a SF novel...");
        System.out.println(toString());
        System.out.println("****************************************");
    }

    @Override
    public String toString() {
        return "OldNovelist [name=" + name + "]";
    }
}
