package pckg_2dDraw;

public class Circle implements BasicShape{
    private String shapeName;

    public Circle(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String ShapeName() {
        return this.shapeName;
    }

    @Override
    public void draw() {
        System.out.println("Drawing --> " + ShapeName() );
    }

    @Override
    public void resize(int newSize) {
        System.out.println("Resizing a circle");
        System.out.println("New size: " + newSize);
    }

    @Override
    public String description() {
        String description = getClass().getSimpleName() + " " + ShapeName();

        return description;
    }

    @Override
    public boolean isHide(int hide) {
        if(hide == 0) {

            return false;
        }else{

            return true;
        }

    }
}
