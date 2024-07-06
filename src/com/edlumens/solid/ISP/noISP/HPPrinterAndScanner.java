package com.edlumens.solid.ISP.noISP;

// Fax and Internet fax method not implemented
public class HPPrinterAndScanner 
   implements MultiFunctionDevice{

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
	 
	}

	@Override
	public void internetFax() {
	 	
	}

}

