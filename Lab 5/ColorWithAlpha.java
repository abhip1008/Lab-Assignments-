import java.awt.*;

public class ColorWithAlpha extends SimpleColor{
    private int alpha;

    public ColorWithAlpha(int alpha) {
        super(0, 0, 0);
        setAlpha(alpha);
    }

    public ColorWithAlpha(int r, int g, int b, int alpha) {
        super(r, g, b);
        setAlpha(alpha);
    }

    public ColorWithAlpha(ColorWithAlpha other) {
        super(other);
        this.alpha = other.alpha;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        if(alpha < 0 || alpha > 255) {
            throw new ColorException("Alpha value out of range: " + alpha);
        }
        this.alpha = alpha;
    }

    @Override
    public String toString() {
        return super.toString() + ", alpha: " + alpha;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || !(o instanceof ColorWithAlpha)) {
            return false;
        }
        ColorWithAlpha that = (ColorWithAlpha) o;
        return super.equals(that) && this.alpha == that.alpha;
    }
}
