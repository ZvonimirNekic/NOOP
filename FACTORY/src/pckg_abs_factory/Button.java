package pckg_abs_factory;

public abstract class Button extends Compoment {

    protected String buttonName;

    protected Button(String buttonName){
        this.buttonName = buttonName;
    }

    public abstract void createButton();

}
