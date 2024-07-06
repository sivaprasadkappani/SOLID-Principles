package com.edlumens.solid.LSP;

import java.util.ArrayList;
import java.util.List;

public class CarUtils {
	public static void main(String[] args) {
		Vehicle first = new Car();
		Vehicle second = new Car();
		Vehicle third = new RacingCar();

		List<Vehicle> carList = new ArrayList<Vehicle>();
		carList.add(first);
		carList.add(second);
		carList.add(third);

		for (Vehicle car : carList) {
            System.out.println( car.getInteriorWidth() );
           
		}
		
		 
		
	}
}
