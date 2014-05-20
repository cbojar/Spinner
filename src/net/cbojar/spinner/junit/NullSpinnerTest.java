package net.cbojar.spinner.junit;

import static org.junit.Assert.*;
import net.cbojar.spinner.spinners.*;

import org.junit.Test;

public class NullSpinnerTest
{
	@Test
	public void testHasNext() {
		Spinner spinner = new NullSpinner();
		assertFalse(spinner.hasNext());
	}

	@Test
	public void testNext() {
		Spinner spinner = new NullSpinner();
		StringBuilder result = spinner.next();
		assertNotNull(result);
		assertEquals(0, result.length());
	}
}
