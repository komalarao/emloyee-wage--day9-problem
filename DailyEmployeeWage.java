package com.bridgelabz.day9.problem;

public class DailyEmployeeWage {
	void attendance() {
		int fulldayHours = 8 , wagePerHour = 20;
		double check= Math.floor(Math.random()*10)%2;
		if(check == 1) {
			System.out.println("employee is present");
		}else {
			System.out.println("employee is abscent");
		}
	
			
			int dailyWage = (fulldayHours*wagePerHour);
			System.out.println("employee is present and his daily wage is "+dailyWage);
		
		}
	public static void main(String[] args) {
		
		new DailyEmployeeWage().attendance();  
		//new DailyEmployeeWage().employeeWage(8,20);
} 
}