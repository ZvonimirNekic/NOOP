package pckg_2dDraw;

public class Rectangle implements BasicShape {
    private String shapeName;

    public Rectangle(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String ShapeName() {
        return this.shapeName;
    }

    @Override
    public void draw() {
        System.out.println("Drawing --> " + ShapeName());
    }

    @Override
    public void resize(int newSize) {
        System.out.println("Resizing rectangle to size: " + newSize);
    }

    @Override
    public String description() {
        return "This is a " + ShapeName();
    }

    @Override
    public boolean isHide(int hide) {
        return hide != 0;
    }
}