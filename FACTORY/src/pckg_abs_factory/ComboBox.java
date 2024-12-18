package pckg_abs_factory;

public abstract class ComboBox extends Compoment{

    protected int defaultRow;

    protected ComboBox(int row){
        this.defaultRow = row;
    }

    public abstract void createCombo();


}
