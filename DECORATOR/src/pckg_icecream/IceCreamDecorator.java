package pckg_icecream;

public abstract class IceCreamDecorator extends BaseIceCream{

    protected BaseIceCream iceCream;

    protected IceCreamDecorator(BaseIceCream baseIceCream, int amount, double unitPrice) {
        super(amount, unitPrice);
        this.iceCream = baseIceCream;
    }



}
