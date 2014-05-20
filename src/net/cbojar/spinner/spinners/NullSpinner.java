package net.cbojar.spinner.spinners;

public final class NullSpinner implements Spinner
{
	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public StringBuilder next() {
		return new StringBuilder();
	}

	@Override
	public void reset() {
	}
}
