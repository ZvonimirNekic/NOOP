package zad_1;

/**
 * Klasa WaiterInvoker predstavlja konobara koji upravlja narudžbama.
 */
public class WaiterInvoker {
    private String waiterName;
    private IntCommand command;

    public WaiterInvoker(String waiterName) {
        this.waiterName = waiterName;
    }

    public void setOrderCommand(IntCommand command) {
        this.command = command;
    }

    public void setUpOrder() {
        System.out.println(waiterName + " is setting up the order.");
        command.executeOrder();
    }

    public void withdrawOrder() {
        System.out.println(waiterName + " is withdrawing the order.");
        command.undoOrder();
    }
}
