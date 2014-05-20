package net.cbojar.spinner.junit;

import static org.junit.Assert.*;
import net.cbojar.spinner.spinners.*;

import org.junit.Test;

public class AlphaSpinnerTest
{
	public static Spinner nullSpinner = new NullSpinner();

	@Test
	public void testHasNext() {
		Spinner spinner = new AlphaSpinner(nullSpinner);
		assertTrue(spinner.hasNext());
		for(char c = 'a'; c <= 'z'; c++) {
			spinner.next();
		}
		assertFalse(spinner.hasNext());
	}

	@Test
	public void testNext() {
		Spinner spinner = new AlphaSpinner(nullSpinner);
		for(char c = 'a'; c <= 'z'; c++) {
			assertEquals(String.valueOf(c), spinner.next().toString());
		}
		assertEquals("", spinner.next().toString());
	}

	@Test
	public void testReset() {
		Spinner spinner = new AlphaSpinner(nullSpinner);
		for(char c = 'a'; c <= 'z'; c++) {
			spinner.next();
		}
		spinner.reset();
		assertTrue(spinner.hasNext());
		assertEquals("a", spinner.next().toString());
	}
}
