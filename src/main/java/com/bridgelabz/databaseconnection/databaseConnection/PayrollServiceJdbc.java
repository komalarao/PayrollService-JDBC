package com.bridgelabz.databaseconnection.databaseConnection;

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
			statement.execute("update employee_payroll set basic_pay=3000000 where name = 'terissa';");

			if (statement != null) {
				System.out.println("connection is successful:");
			}
			ResultSet output = statement.executeQuery("select * from employee_payroll ;");
			
			  while(output.next()) { System.out.print("id: "+output.getInt(1)+"\t");
			  System.out.println("name: "+output.getString(2));
			  System.out.println("salary: "+output.getInt(3));
			  System.out.println("date: "+output.getString(4));
			  System.out.println("gender: "+output.getString(5));
			  System.out.println("phone: "+output.getLong(6));
			  System.out.println("address: "+output.getString(7));
			  System.out.println("department: "+output.getString(8));
			  System.out.println("basicPay: "+output.getInt(9));
			  System.out.println("deductions: "+output.getInt(10));
			  System.out.println("taxablePay: "+output.getInt(11));
			  System.out.println("incometax: "+output.getInt(12));
			  System.out.println("netpay: "+output.getInt(13)); 
			  System.out.println(); 
			  }
			 

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
