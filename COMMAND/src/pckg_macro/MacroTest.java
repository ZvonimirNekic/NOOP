package pckg_macro;

public class MacroTest {

        public static void main(String[] args) {
            Controller controller = new Controller();
            GarageDoorOpen garageDoorOpen = new GarageDoorOpen();
            GarageLightOn garageLightOn = new GarageLightOn();
            controller.setCommand(garageDoorOpen);
            controller.pressOnButton();
            controller.pressReverseActionCommand();
            controller.setCommand(garageLightOn);
            controller.pressOnButton();
            controller.pressReverseActionCommand();
        }
}
