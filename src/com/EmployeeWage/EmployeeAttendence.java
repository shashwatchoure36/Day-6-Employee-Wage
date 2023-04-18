package com.EmployeeWage;
import java.util.Random;

public class EmployeeAttendence {
	
	private enum attendence {Present, Absent};
	
	static Random randomNum = new Random();
    private static int result = randomNum.nextInt(2);
    private int Absent = 0;
    private int Present = 1;
    static attendence attendence_chk;

	public static void main(String[] args) {
		
		checkAttendence();
	}
		
		
	
		
	public static void checkAttendence() {
		
		if (result == 0) {
            attendence_chk = attendence.Absent;
            System.out.println("Employee is Absent!");
        } else {
            attendence_chk = attendence.Present;
            System.out.println("Employee is Present!");
        }
	

}
}
		

	
	
	


