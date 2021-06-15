package emp;
/* calculate the daily Employee Wage by adding part time Employee and wage
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
		int emphr = 0;
		
		double empcheck = Math.floor(Math.random() * 10 ) % 3;
		if(empcheck == IS_FULL_TIME)
 		{
			int emphrs = 8;
			 salary = (emphrs * empwagePerHour);
			System.out.println("salary = " + salary);
		}
		else if(empcheck == IS_PART_TIME)
		{
			int emphrs = 4;
             salary = (emphrs * empwagePerHour);
			System.out.println("salary = " + salary);
		}
		else 
		{
			 salary = 0;
                        System.out.println("salary = " + salary);

		}
		
	}
	public static void main(String[] args) {
		EmployeeWage();
	}	
}

