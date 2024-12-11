package pckg_2dDraw;

public class FillColorDecorator extends ShapeDecorator{

    public FillColorDecorator(BasicShape decoratedShape) {
        super(decoratedShape);

    }

    public void setFillColor(Color color) {
        System.out.println("Filled with color: " + color);
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
