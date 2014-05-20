package net.cbojar.spinner.spinners;

public class NumericSpinnerFactory extends SpinnerFactory
{
	@Override
	public Spinner getInstance(final Spinner innerSpinner) {
		return new NumericSpinner(innerSpinner);
	}
}
