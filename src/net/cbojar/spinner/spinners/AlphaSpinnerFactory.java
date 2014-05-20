package net.cbojar.spinner.spinners;

public class AlphaSpinnerFactory extends SpinnerFactory
{
	@Override
	public Spinner getInstance(final Spinner innerSpinner) {
		return new AlphaSpinner(innerSpinner);
	}
}
