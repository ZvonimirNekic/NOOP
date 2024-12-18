package pckg_abs_factory;

public class LinuxButton extends Button{
    protected LinuxButton(String buttonName) {
        super(buttonName);
    }

    @Override
    public void createButton() {
        System.out.println("Creating: " + getClass().getSimpleName());
    }

    @Override
    public void renderComponent() {
        System.out.println("Rendering after creation :" + getClass().getSimpleName());
    }
}
