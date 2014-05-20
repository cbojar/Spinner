package net.cbojar.spinner.spinners;

public class NumericSpinner implements Spinner
{
	private final Spinner innerSpinner;
	private byte index;

	public NumericSpinner(final Spinner innerSpinner) {
		this.innerSpinner = innerSpinner;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < 10;
	}

	@Override
	public StringBuilder next() {
		StringBuilder result;
		if(hasNext()) {
			result = innerSpinner.next().insert(0, index);
		} else {
			result = new StringBuilder();
		}

		if(!innerSpinner.hasNext()) {
			innerSpinner.reset();
			index++;
		}

		return result;
	}

	@Override
	public void reset() {
		index = 0;
		innerSpinner.reset();
	}
}
