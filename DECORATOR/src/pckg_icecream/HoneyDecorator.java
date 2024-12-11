package pckg_icecream;

public class HoneyDecorator extends IceCreamDecorator{


    protected HoneyDecorator(BaseIceCream baseIceCream, int amount, double unitPrice) {
        super(baseIceCream, amount, unitPrice);
    }

    @Override
    public void provideIceCreamDescription() {
        this.iceCream.provideIceCreamDescription();
        System.out.println("Decorated with: " + getClass().getSimpleName());
    }

    @Override
    public void makeIceCream() {
        System.out.println("Making decoration");
    }

    @Override
    public double getPrice() {
        return this.iceCream.getPrice() + amount * unitPrice;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
