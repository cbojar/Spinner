package net.cbojar.spinner.junit;

import static org.junit.Assert.*;
import net.cbojar.spinner.spinners.*;

import org.junit.Test;

public class BinarySpinnerTest
{
	public static Spinner nullSpinner = new NullSpinner();

	@Test
	public void testHasNext() {
		Spinner spinner = new BinarySpinner(nullSpinner);
		assertTrue(spinner.hasNext());
		spinner.next();
		spinner.next();
		assertFalse(spinner.hasNext());
	}

	@Test
	public void testNext() {
		Spinner spinner = new BinarySpinner(nullSpinner);
		assertEquals("0", spinner.next().toString());
		assertEquals("1", spinner.next().toString());
		assertEquals("", spinner.next().toString());
	}

	@Test
	public void testReset() {
		Spinner spinner = new BinarySpinner(nullSpinner);
		spinner.next();
		spinner.next();
		spinner.reset();
		assertTrue(spinner.hasNext());
		assertEquals("0", spinner.next().toString());
	}
}
