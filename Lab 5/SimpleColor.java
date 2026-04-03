//TODO: if you use this class because you dont have your
//previous SimpleColor, you must document the code with comments
//and fix the setters so they don't invalidate the [0-255] rule
public class SimpleColor {
	private int r;
	private int g;
	private int b;

	public SimpleColor() {
		this(0, 0,0);
	}

	public SimpleColor(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}

	public SimpleColor(SimpleColor other) {

		this(other.r,other.g,other.b);//calling copy constructor?
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		if(r < 0 || r > 255) {
			throw new ColorException("Red value our of range: " + r);
		}
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		if(g < 0 || g > 255) {
			throw new ColorException("Green value our of range: " + g);
		}
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		if(b < 0 || b > 255) {
			throw new ColorException("Blue value our of range: " + b);
		}
		this.b = b;
	}

	public void setColor(int a, int b, int c) {
		setR(a);
		setG(b);
		setB(c);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || !(o instanceof SimpleColor)) {
			return false;
		}
		SimpleColor that = (SimpleColor) o;
		return this.r == that.r && this.g == that.g && this.b == that.b;
	}

	@Override
	public String toString() {
		return "(" + r + ", " + g + ", " + b + ")";
	}
	
}
