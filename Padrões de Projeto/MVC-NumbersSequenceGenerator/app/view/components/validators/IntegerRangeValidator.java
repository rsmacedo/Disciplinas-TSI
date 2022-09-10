package app.view.components.validators;

public class IntegerRangeValidator implements IValidator {

	private final int MIN_VALUE;
	private final int MAX_VALUE;

	public IntegerRangeValidator(final int MIN_VALUE, final int MAX_VALUE) {

		if (MIN_VALUE > MAX_VALUE)
			throw new RuntimeException("Invalid 0 minValue should be ");

		this.MIN_VALUE = MIN_VALUE;
		this.MAX_VALUE = MAX_VALUE;
	}

	private boolean isWithinRange(int value) {
		return ((value >= MIN_VALUE) && (value <= MAX_VALUE));
	}

	@Override
	public boolean isValid(String text) {

		if (MIN_VALUE < 0 && text.equalsIgnoreCase("-"))
			return true;

		try {
			int value = Integer.parseInt(text);
			return isWithinRange(value);
		}

		catch (NumberFormatException ex) {
			return false;
		}

	}

}
