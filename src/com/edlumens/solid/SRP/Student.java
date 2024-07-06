package com.edlumens.solid.SRP;

import java.util.Date;

public class Student {
    private int studentId;
    private Date dob;
    private String firstName;
    private String lastName;

    // Constructor
    public Student(int studentId, Date dob, String firstName, String lastName) {
        this.studentId = studentId;
        this.dob = dob;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
    	return firstName + lastName;
    }
         
}
