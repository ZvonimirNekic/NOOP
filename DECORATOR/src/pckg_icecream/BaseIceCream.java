package pckg_icecream;

public abstract class BaseIceCream implements IceCream{
    protected double unitPrice;
    protected int amount;
    protected BaseIceCream(int amount, double unitPrice){
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public abstract void provideIceCreamDescription();

}
