package com.bridgelabz.day9.problem;

public class AddingPartTime {
	void attendance(){
		double check= Math.floor(Math.random()*10)%3;
		int fulltime=0;
		int parttime = 1;
		int fulldayHours = 8;
		int rateperHour = 20;
		int number = (int) check;
		switch(number) {
		case 0:
			
				System.out.println("employee is prsesent");
				System.out.println("employee daily wage is "+(fulldayHours*rateperHour));
			break;	
		case 1:
			int dayHours = 4;
			    System.out.println("employee is present but parttime:");
			    System.out.println("employee daily wage is "+(dayHours*rateperHour));
			    break;
		default:
			System.out.println("employee is abscent");
			    
		}
	
			
		
	}public static void main(String[] args) {
		new AddingPartTime().attendance();
	}
}
