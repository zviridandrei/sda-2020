package ro.unitbv.javadatatype.Laborator_3;

public class Square implements Shape {

	private static final String NUME_CONSTANTA = "Square";

	private String fillColor;
	private int borderWidth;
	private int size;
	private HexColor validate;
	private Border validateBorder;
	private ShapeDimension validateDimensions;

	public Square(String fillColor, int borderWidth, int size) {
		this.fillColor = fillColor;
		this.borderWidth = borderWidth;
		this.size = size;
		this.validate = new HexColor();
		this.validateBorder = new Border();
		this.validateDimensions = new ShapeDimension();
	}

	public double getArea() {

		boolean ok = validateDimensions.validateSquare(size);

		if (ok == true)
			return size * size;
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

		String a[][] = new String[size][size];

		for (int i = 0; i < size; i++)

			for (int j = 0; j < size; j++)

				a[i][j] = "\0";

		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++) {
				if (i == 0) {
					a[0][j] = ".";
				}

				if (j == 0) {
					a[i][0] = ".";
				}

				if (i == size - 1)
	
				{
					a[size - 1][j] = ".";
				}
				if (j == size - 1) {
					a[i][size - 1] = ".";
				}
			}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}

	}

}