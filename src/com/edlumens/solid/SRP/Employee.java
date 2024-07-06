package com.edlumens.solid.SRP;

public class Employee {
    private String employeeID;
    private String firstName;
    private String lastName;
    private String employeeType;
    private double salary;

    // Constructor
    public Employee(String employeeID, String firstName, String lastName, String employeeType, double salary) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeType = employeeType;
        this.salary = salary;
    }

    
    
    public String getEmployeeID() {
		return employeeID;
	}



	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmployeeType() {
		return employeeType;
	}



	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}



	public void save() {
       String objectString = employeeID + "," + firstName + "," + employeeType;
       Connection con = null;
       Statement stmt = null;
       -----
    }
    
    public double calculateTax() {
        // Assuming a fixed tax rate of 20%
        double taxRate = 0.20;
        double tax = salary * taxRate;
        return tax;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "employeeID='" + employeeID + '\'' +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", employeeType='" + employeeType + '\'' +
               ", salary=" + salary +
               '}';
    }

     
}
