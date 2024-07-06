package com.edlumens.solid.coupling.tight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

     

    // Method to save the student's information to the database
    public void save() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Establish a database connection (modify URL, username, and password as needed)
            String url = "jdbc:mysql://localhost:3306/your_database";
            String username = "your_username";
            String password = "your_password";

            connection = DriverManager.getConnection(url, username, password);

            // Prepare an SQL statement for inserting student data
            String sql = "INSERT INTO students (student_id, dob, first_name, last_name) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Set the values for the prepared statement
            preparedStatement.setInt(1, studentId);
            preparedStatement.setDate(2, new java.sql.Date(dob.getTime()));
            preparedStatement.setString(3, firstName);
            preparedStatement.setString(4, lastName);

            // Execute the SQL statement to insert the data
            preparedStatement.executeUpdate();

            System.out.println("Student information saved to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
        }
    }

    
}
