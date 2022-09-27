package com.crudoprestion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
                  //CRED  - OPRATION SATRT
                 //C=CREATING TABLE

//Create table by using JDBC TO Coounet MySql using preper Satment
public class CreatTableUsingPs {
	public static void main(String [] args) {
		try {
			// load the driver class 
			Class.forName("com.mysql.jdbc.Driver");
			// Estabilish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atul", "root", "Atul@242800");
			// by using preper Statement
			
			PreparedStatement ps = con.prepareStatement("CREATE TABLE homerecord(\r\n"
					+ "         id int(10) not null auto_increment,\r\n"
				    +"           month varchar(255),\r\n"
					+ "         date varchar(255),\r\n"
					+ "         grocery varchar(89),\r\n"
					+ "         vegetable varchar(255),\r\n"
					+ "         electricalShop varchar(255),\r\n"
					+ "         cosmaticshop varchar(50),\r\n"
					+ "         other int(50),\r\n"
					+ "          primary key(id));");
	
			
			//Execute Query
			int i = ps.executeUpdate();
			System.out.println("creating table>>>>"+i);
			con.close();
			ps.close();
			       
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	}


