package com.edlumens.solid.LSP.nolsp;

public class RacingCar extends Car {
	public double getCabinWidth() {
	       throw new RuntimeException( "Not implemented" );
		}
	
	public double getCockpitWidth() {
	       return 9.8;
		}
}
