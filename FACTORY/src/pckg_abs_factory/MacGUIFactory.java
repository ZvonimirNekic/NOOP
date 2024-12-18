package pckg_abs_factory;

public class MacGUIFactory implements AbstractGUIFactory{
    @Override
    public void createGUI() {
        Button button = new MacButton("Click me");
        TextField textField = new MacTextField(10);
        ComboBox comboBox = new MacComboBox(1);

        button.createButton();
        button.renderComponent();

        textField.createTextFiled();
        textField.renderComponent();

        comboBox.createCombo();
        comboBox.renderComponent();
    }
}
