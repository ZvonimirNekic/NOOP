package pckg_2dDraw;

public class LineStyleDecorator extends ShapeDecorator {
    private LineStyle lineStyle;

    public LineStyleDecorator(BasicShape shape2Decorate) {
        super(shape2Decorate);
    }


    public void setLineStyle(LineStyle style) {
        this.lineStyle = style;
    }

    @Override
    public String ShapeName() {
        return null;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        if (lineStyle != null) {
            System.out.println("Line style: " + lineStyle);
        }
    }

    @Override
    public void resize(int newSize) {

    }

    @Override
    public String description() {
        return decoratedShape.description() + (lineStyle != null ? "\nLine style: " + lineStyle : "");
    }

    @Override
    public boolean isHide(int hide) {
        return decoratedShape.isHide(hide);
    }
}