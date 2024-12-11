package pckg_2dDraw;

public class App {
    public static void main(String[] args) {

        System.out.println("Creating decorated circle with:");
        BasicShape circle = new Circle("Circle");
        FillColorDecorator filledCircle = new FillColorDecorator(circle);
        filledCircle.setFillColor(Color.BLUE);

        LineColorDecorator lineDecoratedCircle = new LineColorDecorator(filledCircle);
        lineDecoratedCircle.setLineColor(Color.RED);

        LineStyleDecorator styledCircle = new LineStyleDecorator(lineDecoratedCircle);
        styledCircle.setLineStyle(LineStyle.DASH_DOT_DASH);
        styledCircle.draw();
        System.out.println(styledCircle.description());
        System.out.println("********************************************");


        System.out.println("Creating decorated rectangle with:");
        BasicShape rectangle = new Rectangle("Rectangle");
        FillColorDecorator filledRectangle = new FillColorDecorator(rectangle);
        filledRectangle.setFillColor(Color.YELLOW);

        LineStyleDecorator styledRectangle = new LineStyleDecorator(filledRectangle);
        styledRectangle.setLineStyle(LineStyle.DASH_SPACE);
        styledRectangle.draw();
        System.out.println(styledRectangle.description());
        System.out.println("********************************************");


        System.out.println("Creating decorated triangle with:");
        BasicShape triangle = new Triangle("Triangle");
        LineStyleDecorator styledTriangle = new LineStyleDecorator(triangle);
        styledTriangle.setLineStyle(LineStyle.DOT);
        styledTriangle.draw();
        System.out.println(styledTriangle.description());
    }
}