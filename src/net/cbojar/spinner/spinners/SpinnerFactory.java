package net.cbojar.spinner.spinners;

public abstract class SpinnerFactory
{
	public Spinner getInstance() {
		final Spinner terminalSpinner = new NullSpinner();
		return getInstance(terminalSpinner);
	}

	public abstract Spinner getInstance(final Spinner innerSpinner);
}
