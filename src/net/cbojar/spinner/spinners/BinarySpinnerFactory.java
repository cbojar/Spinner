package net.cbojar.spinner.spinners;

public class BinarySpinnerFactory extends SpinnerFactory
{
	@Override
	public Spinner getInstance(final Spinner innerSpinner) {
		return new BinarySpinner(innerSpinner);
	}
}
