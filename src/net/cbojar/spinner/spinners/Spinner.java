package net.cbojar.spinner.spinners;

public interface Spinner
{
	public boolean hasNext();
	public StringBuilder next();
	public void reset();
}
