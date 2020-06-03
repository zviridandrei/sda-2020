package Lab_3;

public class Circle implements Shape {
	private static final String NUME_CONSTANTA = "Circle";

	private String fillColor;
	private int borderWidth;
	private int radius;
	private HexColor validate;
	private Border validateBorder;
	private ShapeDimension validateDimensions;

	public Circle(String fillColor, int borderWidth, int radius) {
		this.fillColor = fillColor;
		this.borderWidth = borderWidth;
		this.radius = radius;
		this.validate = new HexColor();
		this.validateBorder = new Border();
		this.validateDimensions = new ShapeDimension();
	}

	public double getArea() {

		boolean ok = validateDimensions.validateCircle(radius);

		if (ok == true)
			return 3.14 * (radius * radius);
		return 0;

	}

	public String getName() {
		return NUME_CONSTANTA;
	}

	public int getBorderWidth() {
		boolean ok = validateBorder.validate(borderWidth);
		if (ok == true)
			return borderWidth;

		return 0;

	}

	public String getHexFillColor() {

		boolean ok = validate.validate(fillColor);

		if (ok == true)
			return fillColor;

		return "\0";
	}

	public void Draw() {
		int posX = 6;
		int posY = 10;

		for (int i = 0; i <= posX + radius; i++) {
			for (int j = 1; j <= posY + radius; j++) {
				int xSquared = (i - posX) * (i - posX);
				int ySquared = (j - posY) * (j - posY);
				if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}