package com.bridgelabz.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PayrollServiceJdbc {
	
	public static void main(String args[]) {
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrollservice", "root",
					"root");
			Statement statement = connect.createStatement();
			statement.execute("SELECT SUM(salary) FROM employee_payroll WHERE gender = 'F' GROUP BY gender;");
			statement.execute("SELECT AVG(salary) FROM employee_payroll WHERE gender = 'F' GROUP BY gender;");
			statement.execute("SELECT MIN(salary) FROM employee_payroll WHERE gender = 'F' GROUP BY gender;");
			statement.execute("SELECT MAX(salary) FROM employee_payroll WHERE gender = 'F' GROUP BY gender;");
			statement.execute("SELECT COUNT(salary) FROM employee_payroll WHERE gender = 'F' GROUP BY gender;");

			if (statement != null) {
				System.out.println("connection is successful:");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
