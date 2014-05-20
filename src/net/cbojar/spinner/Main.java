package net.cbojar.spinner;

import net.cbojar.spinner.spinners.*;

public final class Main
{
	public static void main(final String[] args) {
		final SpinnerFactory spinFactory = new BinarySpinnerFactory();

		Spinner spin = spinFactory.getInstance();
		for(byte i = 1; i < 8; i++) {
			spin = spinFactory.getInstance(spin);
		}

		while(spin.hasNext()) {
			System.out.println(spin.next().toString());
		}
	}
}
