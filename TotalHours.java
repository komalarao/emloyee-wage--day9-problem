package com.bridgelabz.day9.problem;


public class TotalHours {
	void attendance(){
		double check= Math.floor(Math.random()*10)%3;
		int fulltime=0;
		int parttime = 1;
		int maximumHours = 100;
		int WorkingDays = 20;
		int number = (int) check;
		int totalHours = 0, totalWorkingDays =0 ,employeeHours = 0 , ratePerHour = 20;
		while(totalHours<=maximumHours && totalWorkingDays< WorkingDays ) {
			totalWorkingDays++;
		
		switch(number) {
		case 0:
			employeeHours  = 8;
				
			break;	
		case 1:
			employeeHours = 4;
			
	
			    break;
		default:
			employeeHours = 0;
			    
		}
	    totalHours = totalHours+employeeHours;
	    System.out.println("total days are: "+totalWorkingDays +" total hours are "+totalHours);
	    
		}	
		System.out.println("total employee wage is: "+(totalHours*ratePerHour));
	    }
    
	public static void main(String[] args) {
		new TotalHours().attendance();
	}
}
