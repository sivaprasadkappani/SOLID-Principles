package com.edlumens.solid.OCP.noocp;

public class InsuarancePremiumDiscountCalculator {
	public int calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customerProfile) {
		if (customerProfile.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}
	
	public int calculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile customerProfile) {
		if (customerProfile.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}
}
