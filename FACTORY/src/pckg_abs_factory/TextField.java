package pckg_abs_factory;

public abstract class TextField extends Compoment{

    protected int numberOfColumns;

    protected TextField(int columns){
        this.numberOfColumns = columns;
    }

    public abstract void createTextFiled();

}
