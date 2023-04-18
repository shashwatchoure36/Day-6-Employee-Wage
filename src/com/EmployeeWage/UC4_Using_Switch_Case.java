package com.EmployeeWage;

public class UC4_Using_Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int attendance = (int) (Math.random() * 3);

		// Constant variables
		final int present_full_time = 1;
		final int present_part_time = 2;
		final int full_day_hour = 8;
		final int part_time_hour = 4;
		final int wage_per_hour = 20;

		// Initializing the variable
		int salary = 0;
		int daily_hour = 0;

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
			System.out.println("Employee is Absent");
			break;
		}

		// Calculating salary of an Employee
		salary = daily_hour * wage_per_hour;
		System.out.println("Salary of Employee is : Rs." + salary);

	}

}
