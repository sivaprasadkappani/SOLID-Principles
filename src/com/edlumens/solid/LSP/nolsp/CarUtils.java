package com.edlumens.solid.LSP.nolsp;

import java.util.ArrayList;
import java.util.List;

public class CarUtils {
	public static void main(String[] args) {
		Car first = new Car();
		Car second = new Car();
		Car third = new RacingCar();

		List<Car> carList = new ArrayList<Car>();
		carList.add(first);
		carList.add(second);
		carList.add(third);

		for (Car car : carList) {
            System.out.println( car.getCabinWidth() );
            // Code breaks for RacingCar
		}
	}
}
