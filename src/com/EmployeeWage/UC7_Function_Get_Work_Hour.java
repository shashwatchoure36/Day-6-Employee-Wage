package com.EmployeeWage;

public class UC7_Function_Get_Work_Hour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method declaration
		calculateMonthlyWage();

	}

	private static void calculateMonthlyWage() {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
		System.out.println("----------------------------------------------");

		// Constant variables
		final int present_full_time = 1;
		final int present_part_time = 2;
		final int full_day_hour = 8;
		final int part_time_hour = 4;
		final int wage_per_hour = 20;
		final int total_working_days = 20;
		final int max_working_hours = 100;

		// Initializing the variable
		int salary = 0;
		int daily_hour = 0;
		int total_working_hour = 0;
		int monthly_salary = 0;
		int day = 1;

		while (day <= total_working_days && total_working_hour <= max_working_hours) {
			/*
			 * Used Math.random()*3 to get two values i.e., 0, 1 and 2 0 - Absent 1 -
			 * Present Full time 2 - Present Part time
			 */
			int attendance = (int) (Math.random() * 3);

			// Switch case
			switch (attendance) {
			// Full time
			case present_full_time:
				daily_hour = 8;
				System.out.println("Employee is Present for Full time");
				break;

			// Part time
			case present_part_time:
				daily_hour = 4;
				System.out.println("Employee is Present for Part time");
				break;

			case 0:
				daily_hour = 0;
				System.out.println("Employee is Absent");
				break;
			}

			// Calculating salary of an Employee
			salary = daily_hour * wage_per_hour;
			System.out.println("Salary of Employee is : Rs." + salary);

			// Calculating total working hour of Employee
			total_working_hour = total_working_hour + daily_hour;
			System.out.println("Total working hours : " + total_working_hour);
			System.out.println("----------------------------------------------");
			
			day+=1;
		}

		// Calculating Monthly salary of Employee
		monthly_salary = total_working_hour * wage_per_hour;
		System.out.println("Monthly salary of Employee is : Rs." + monthly_salary);
		
	}

}
