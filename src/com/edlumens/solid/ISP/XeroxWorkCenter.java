package com.edlumens.solid.ISP;

// All the 6 methods implemented
public class XeroxWorkCenter 
    implements Printer, Scanner, Fax {

	@Override
	public void print() {
		// Code to print
	}

	@Override
	public void getPrintSpoolDetails() {
		// Code to retunr print spool details
	}

	@Override
	public void scan() {
		// Code to scan
		
	}

	@Override
	public void sacnPhoto() {
		// code to scan photo
		
	}

	@Override
	public void fax() {
		// Sent fax code
		
	}

	@Override
	public void internetFax() {
		// internet fax code
		
	}

}
