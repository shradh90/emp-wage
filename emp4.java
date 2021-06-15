package emp;
/* calculate the daily Employee Wage by adding part time Employee and wage using Switch statement
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
      	//calculate the daily Employee Wage by adding part time Employee and wage using Switch statement
		for(int i = 0; i < 30; i++) {
			int empCheck = (int) (Math.floor(Math.random() * 10 ) % 3);
			switch (empCheck) {
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
	public static void main(String[] args) {
		EmployeeWage();
	}
	
	}

