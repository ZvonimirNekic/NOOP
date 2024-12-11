package pckg_2dDraw;

public class Triangle implements BasicShape {
    private String shapeName;

    public Triangle(String shapeName) {
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
        System.out.println("Resizing triangle to size: " + newSize);
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