package com.edlumens.solid.LSP;

public class RacingCar extends Vehicle {
	@Override
	public double getInteriorWidth() {
		return getCockpitWidth();
	}

	public double getCockpitWidth() {
		return 9.8;
	}
}
