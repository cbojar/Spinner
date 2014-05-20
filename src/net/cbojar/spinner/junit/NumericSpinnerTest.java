package net.cbojar.spinner.junit;

import static org.junit.Assert.*;
import net.cbojar.spinner.spinners.*;

import org.junit.Test;

public class NumericSpinnerTest
{
	public static Spinner nullSpinner = new NullSpinner();

	@Test
	public void testHasNext() {
		Spinner spinner = new NumericSpinner(nullSpinner);
		assertTrue(spinner.hasNext());
		for(int i = 0; i < 10; i++) {
			spinner.next();
		}
		assertFalse(spinner.hasNext());
	}

	@Test
	public void testNext() {
		Spinner spinner = new NumericSpinner(nullSpinner);
		for(char c = '0'; c <= '9'; c++) {
			assertEquals(String.valueOf(c), spinner.next().toString());
		}
		assertEquals("", spinner.next().toString());
	}

	@Test
	public void testReset() {
		Spinner spinner = new NumericSpinner(nullSpinner);
		for(int i = 0; i < 10; i++) {
			spinner.next();
		}
		spinner.reset();
		assertTrue(spinner.hasNext());
		assertEquals("0", spinner.next().toString());
	}
}
