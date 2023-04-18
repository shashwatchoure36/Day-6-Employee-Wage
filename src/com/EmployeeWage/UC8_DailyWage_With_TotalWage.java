package com.EmployeeWage;

public class UC8_DailyWage_With_TotalWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculateMonthlyWage("AMAZON", 40, 15, 200);
		calculateMonthlyWage("BIGBAZAR", 20, 20, 100);
		calculateMonthlyWage("FLIPKART", 70, 25, 500);
		calculateMonthlyWage("MYNTRA", 40, 25, 300);

	}

	private static void calculateMonthlyWage(String company_name, int wage_per_hour, int total_working_days,
			int max_working_hours) {
		// TODO Auto-generated method stub
		
		//Displaying the details of the Company
				System.out.println("DETAILS OF THE COMPANY " + company_name);
				System.out.println();
				System.out.println("Wage per hour : " + wage_per_hour);
				System.out.println("Total Working Days : " + total_working_days);
				System.out.println("Maximum Working Hours : " + max_working_hours);

				System.out.println("------------------------------------------------------------------------------");
				
				// Constant variables
				final int present_full_time = 1;
				final int present_part_time = 2;

				// Initializing the variable
				int salary = 0;
				int total_working_hour = 0;
				int day = 0;
				int daily_hour = 0;
				int total_salary = 0;


				System.out.println("Day    Daily Hour    Wage_per Hour     Total Working Hour     Salary");
			
				while (day < total_working_days && total_working_hour <= max_working_hours) {
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
						break;

					// Part time
					case present_part_time:
						daily_hour = 4;
						break;

					case 0:
						daily_hour = 0;
						break;
					}
					
					// Calculating salary of an Employee
					salary = daily_hour * wage_per_hour;
					
					// Calculating Monthly salary of Employee
					total_salary = total_salary + salary;

					day++;
					total_working_hour += daily_hour;
					
					
					System.out.printf("%5d      %5d        %5d            %5d               %5d\n", day, daily_hour, wage_per_hour, total_working_hour + daily_hour, salary);
				}
				
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("Monthly salary of Employee in " + company_name + " is Rs." + total_salary);
				System.out.println("------------------------------------------------------------------------------");
				System.out.println();
		
	}

}
