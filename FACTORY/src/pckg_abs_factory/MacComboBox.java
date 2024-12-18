package pckg_abs_factory;

public class MacComboBox extends ComboBox{
    protected MacComboBox(int row) {
        super(row);
    }

    @Override
    public void createCombo() {
        System.out.println("Creating: " + getClass().getSimpleName());
    }

    @Override
    public void renderComponent() {
        System.out.println("Rendering after creation :" + getClass().getSimpleName());
    }
}
