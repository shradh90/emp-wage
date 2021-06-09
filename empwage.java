public class empwage {
	public static void main(String[] args) {
		int is_full_time = 1;
		double empcheck = Math.floor(Math.random() * 10 ) % 2;
		if(empcheck == is_full_time)
 		{
			System.out.println("employee is present");
			int emprateperhr = 20;
			int emphrs = 8;
			int salary = (emphrs * emprateperhr);
			System.out.println("salary = " + salary);
		}
		else
		{
			System.out.println("employee is absent");
			int salary = 0;
			System.out.println("salary = " + salary);
		}
	}

}
