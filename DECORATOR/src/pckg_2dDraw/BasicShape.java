package pckg_2dDraw;

public interface BasicShape {
    String ShapeName();
    void draw();
    void resize(int newSize);
    String description();
    boolean isHide(int hide);
}
