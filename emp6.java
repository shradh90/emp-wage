package emp;
import java.util.Scanner;
/* calculate the Employee wages till a condition of total working hours or days is reached for a month
 * Working Hour Full Time: 8
 * Working Hour Part Time : 4
 * Wage per Hour : 20
 * @author: Shradha Desai
 * @since: 14/06/2021
 */

public class EmpWage {
	//constant variables
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	public static final int empwagePerHour = 20;	
	
	private static void EmployeeWage() {
		//variable
		int salary = 0;
		int emphrs= 0;
       	int sum = 0;
       	int totalworkingdays = 0;
      
       	System.out.println("enter number of working days :	");
        Scanner sc = new Scanner(System.in);
      	int d = sc.nextInt();
      	System.out.println("enter number of working hrs in month :	");
   	    Scanner sc1 = new Scanner(System.in);
      	int h = sc1.nextInt();
     
      	 while((sum <= h) && (totalworkingdays < d)) {
        		for(int i = 0; i < 30; i++) {
                 totalworkingdays++;
     			int empcheck = (int) (Math.floor(Math.random() * 10 ) % 3);
     			switch (empcheck) {
     			  case 0:
     			     	emphrs = 0;
                               break;
     		 	  case 1:
     			     	emphrs = 4;
                                break; 		 
     		          case 2:
     			     	emphrs = 8;
     				            break;
     			}
     		    salary = (emphrs * empwagePerHour);
     			sum =sum + salary; 
                             
     		}
     		System.out.println("toyal salary = " + sum);
     		
      	}
      	
	}
	public static void main(String[] args) {
		EmployeeWage();
	}
	
	}
