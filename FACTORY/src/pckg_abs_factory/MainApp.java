package pckg_abs_factory;

public class MainApp {
    public static void main(String[] args) {
        AbstractGUIFactory guiFactory = new MacGUIFactory();
        AppClient client = new AppClient();
        client.setGuiFactory(guiFactory);
        client.createAppGUI();
    }
}
