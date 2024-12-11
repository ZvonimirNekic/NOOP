package pckg_2dDraw;

public abstract class ShapeDecorator implements BasicShape{

    protected BasicShape decoratedShape;

    protected ShapeDecorator(BasicShape shape2Decorate){
        this.decoratedShape = shape2Decorate;
    }

   protected void setShape2Decorate(BasicShape shape2Decorate){
        this.decoratedShape = shape2Decorate;
   }

}
