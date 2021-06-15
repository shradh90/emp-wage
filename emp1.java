package emp;
/* calculate the attendence of employee
 * @author: Shradha Desai
 * @since: 14/06/2021
 */

public class EmpWage {
	public static final int IS_FULL_TIME = 1;
	private static void Attendence() {
		//To Check whether employee is present or absent
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		if(empCheck == IS_FULL_TIME) {
		System.out.println("Employee is Present");
		} else {
		System.out.println("Employee is Absent");
		}
	}
	public static void main(String[] args) {
		Attendence();
	}
}
