package pckg_2dDraw;

public enum LineStyle {
    SOLID,
    DASH,
    DOT,
    DASH_SPACE,
    DASH_DOT_DASH;

    @Override
    public String toString() {

        switch (this) {
            case SOLID:
                return "Solid";
            case DASH:
                return "Dash";
            case DOT:
                return "Dot";
            case DASH_SPACE:
                return "Dash-Space";
            case DASH_DOT_DASH:
                return "Dash-Dot-Dash";
            default:
                return super.toString();
        }
    }
}