package pckg_2dDraw;

public class LineColorDecorator extends ShapeDecorator{
    protected LineColorDecorator(BasicShape shape2Decorate) {
        super(shape2Decorate);
    }

    public void setLineColor(Color color) {
        System.out.println("Setting line color for " + decoratedShape.ShapeName() + " to color " + color);
    }

    @Override
    public String ShapeName() {
        return decoratedShape.ShapeName();
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

    @Override
    public void resize(int newSize) {
        decoratedShape.resize(newSize);
    }

    @Override
    public String description() {
        return decoratedShape.description() + " with " + getClass().getSimpleName() + " " + ShapeName();
    }

    @Override
    public boolean isHide(int hide) {
        return decoratedShape.isHide(hide);
    }
}
