package pckg_macro;

public class GarageDoorOpen implements Command {

    @Override
    public void run() {
        System.out.println("Garage door is open");
    }

    @Override
    public void undo() {
        System.out.println("Garage door is closed");
    }
}
