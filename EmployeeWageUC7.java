package com.bridgelabz.day8oopsconcept;

public class EmployeeWageUC7 {
	public static final int IS_PART_TIME = 1, IS_FULL_TIME = 2, EMP_RATE_PER_HOUR = 20, 
							NUM_OF_WORKING_DAYS = 20, MAX_HRS_IN_MONTH = 100;
	
	public static void main(String[] args) {
		computeEmpWage();
	}
	public static int computeEmpWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, dailyWage = 0;
		
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case IS_PART_TIME:	empHrs = 4;		break;
				case IS_FULL_TIME:	empHrs = 8;		break;
				default:			empHrs = 0;
	    	}		
		totalEmpHrs += empHrs;
		dailyWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Day no.: " + totalWorkingDays + ", Emp Hrs: " +empHrs + ", Daily Wage: " +dailyWage);	
		}
    	int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
    		System.out.println("Total Employee wage is :" + totalEmpWage);
    	return totalEmpWage;
	}
}