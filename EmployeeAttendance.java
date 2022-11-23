package com.bridgelabz.day9.problem;

public class EmployeeAttendance {
	public static void checking() {
		double check= Math.floor(Math.random()*10)%2;
		if(check == 1) {
			System.out.println("employee is present");
		}else {
			System.out.println("employee is abscent");
		}
	} public static void main(String[] args) {
		new EmployeeAttendance().checking();
	}
}
