package pckg_icecream;

public class AppTest {
    public static void main(String[] args) {
        BaseIceCream chocolate = new ChocolateIceCream(2, 2);
        chocolate.makeIceCream();
        chocolate.provideIceCreamDescription();
        System.out.println(chocolate.getPrice());
        IceCreamDecorator decorator = new WhiteChocolateDecorator(chocolate, 1, 1.5);
        decorator.provideIceCreamDescription();
        decorator.makeIceCream();
        System.out.println("Total price: " + decorator.getPrice());

        IceCreamDecorator decorator2 = new HoneyDecorator(decorator, 1, 10);
        decorator2.provideIceCreamDescription();
        decorator2.makeIceCream();
        System.out.println("Total price: " + decorator2.getPrice());

        System.out.println("---------------New decorator------------------");
        IceCreamDecorator newDecorator = new HoneyDecorator(new WhiteChocolateDecorator(new ChocolateIceCream(1, 2), 1, 1.5), 1, 10);
        newDecorator.provideIceCreamDescription();
        newDecorator.makeIceCream();
        System.out.println("Total price: " + newDecorator.getPrice());
        System.out.println("---------------------------------------------");
    }
}
