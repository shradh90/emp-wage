package emp;
/* calculate the daily Employee Wage 
 * Working Hour Full Time: 8
 * Wage per Hour : 20
 * @author: Shradha Desai
 * @since: 14/06/2021
 */

public class EmpWage {
	//constant variables
	public static final int IS_FULL_TIME = 1;
	public static final int empwagePerHour = 20;	
	private static void EmployeeWage() {
		//variable
		int emphrs = 8;
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		//To calculate the daily salary of employee
		if(empCheck == IS_FULL_TIME)
 		{
			System.out.println("employee is present");
			int salary = (emphrs * empwagePerHour); //it will calculate salary when employee is present full day
			System.out.println("salary = " + salary); //print the salary
		}
		else
		{
			System.out.println("employee is absent");
			int salary = 0; //when employee is absent salary is zero
			System.out.println("salary = " + salary);
		}
		
	}
	public static void main(String[] args) {
		EmployeeWage();
	}
	
	}
