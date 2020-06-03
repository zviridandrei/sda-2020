package ro.unitbv.javadatatype.Laborator_3;

public class Border {
	Boolean validate(int borderWidth) {
		Boolean ok = true;

		if (borderWidth < 0) {
			ok = false;
			throw new IllegalArgumentException("The value for borderWidth cannot be less then 0");
		}

		return ok;
	}

}