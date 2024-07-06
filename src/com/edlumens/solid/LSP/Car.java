package com.edlumens.solid.LSP;

public class Car 
	extends Vehicle{
	
	@Override
	public double getInteriorWidth() {
		return getCabinWidth();
	}
	
	public double getCabinWidth() {
       return 10.0;
	}
}
