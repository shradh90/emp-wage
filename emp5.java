package emp;
/* calculate the Employee wages for a month
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
      
		for(int i = 0; i < 30; i++) {

			double empcheck = Math.floor(Math.random() * 10 ) % 3;
			if(empcheck == IS_FULL_TIME)
 			{
				 emphrs = 8;
				 salary = (emphrs * empwagePerHour);
                sum = sum + salary;
				System.out.println("salary = " + salary);
			}
			else if(empcheck == IS_PART_TIME)
			{
				 emphrs = 4;
                 salary = (emphrs * empwagePerHour);
				sum = sum + salary;
				System.out.println("salary = " + salary);
			}
			else 
			{
			 salary = 0;
			sum =sum + salary;
                        System.out.println("salary = " + salary);
			}
			
		}
		  System.out.println("total salary of a month: " + sum);
       	
	}
	public static void main(String[] args) {
		EmployeeWage();
	}
	
	}

