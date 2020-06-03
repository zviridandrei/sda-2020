package Lab_3;

public class Rectangle implements Shape {
	private static final String NUME_CONSTANTA = "Rectangle";

	private String fillColor;
	private int borderWidth;
	private int width;
	private int height;
	private HexColor validateHex;
	private Border validateBorder;
	private ShapeDimension validateDimensions;

	public Rectangle(String fillColor, int borderWidth, int width, int height) {
		this.fillColor = fillColor;
		this.borderWidth = borderWidth;
		this.width = width;
		this.height = height;
		this.validateHex = new HexColor();
		this.validateBorder = new Border();
		this.validateDimensions = new ShapeDimension();

	}

	public double getArea() {

		boolean ok = validateDimensions.validateRectangle(width, height);

		if (ok == true)
			return height * width;
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

		boolean ok = validateHex.validate(fillColor);

		if (ok == true)
			return fillColor;

		return "\0";

	}

	public void Draw() {

		String a[][] = new String[width][height];

		for (int i = 0; i < width; i++)

			for (int j = 0; j < height; j++)

				a[i][j] = "\0";

		for (int i = 0; i < width; i++)
			for (int j = 0; j < height; j++) {
				if (i == 0) {
					a[0][j] = ".";
				}

				if (j == 0) {
					a[i][0] = ".";
				}

				if (i == width - 1)

				{
					a[width - 1][j] = ".";
				}
				if (j == height - 1) {
					a[i][height - 1] = ".";
				}

			}

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}

	}
}