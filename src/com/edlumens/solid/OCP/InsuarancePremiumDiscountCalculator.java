package com.edlumens.solid.OCP;

public class InsuarancePremiumDiscountCalculator {
	public int calculatePremiumDiscountPercent(CustomerProfile customerProfile) {
		if (customerProfile.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}
}


/*
   What if there come a VehicleInsuranceCustomerProfile?  If no OCP, need to modify existing code by overloading 
   calculatePremiumDiscountPercent
*/