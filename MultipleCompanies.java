package com.bridgelabz.day9.problem;

public class MultipleCompanies {
	
	
	  static void attendance( String companyName, int workingDays , int monthlyWorkingHours,int ratePerHour) {
		    
	    int fulltime=0;
	    int parttime = 1;
	    
		 	int totalHours = 0, totalWorkingDays =0 ,employeeHours = 0;
	 	
			while(totalHours<=monthlyWorkingHours && totalWorkingDays< workingDays ) {
				totalWorkingDays++;
				int number = (int)   Math.floor(Math.random()*10)%3;
			switch(number) {
			case 0:
				employeeHours  = 8;
					
				break;	
			case 1:
				 employeeHours = 4;
				
		
				    break;
			default:
				employeeHours = 0; 
				break;    
			}
		    totalHours = totalHours+employeeHours;
		    System.out.println(" days are :"+totalWorkingDays +"    total hours are :"+(totalHours+employeeHours)+"    wage for day "+totalWorkingDays+" is :"+(employeeHours*ratePerHour) );
		    System.out.println();
		    
			}	
			
			System.out.println("total employee wage in "+companyName+" is "+(totalHours*ratePerHour));
			System.out.println();
			System.out.println("-------------- end--------------");
		    System.out.println();
		    
		    
	  }
		
		public static void main(String[] args) {
			new MultipleCompanies().attendance("reliance",28,150,50);
			new MultipleCompanies().attendance("D-MART",25, 160,40);
		}
}
