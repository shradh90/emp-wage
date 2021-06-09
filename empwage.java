public class empwage {
	public static void main(String[] args) {
		int is_full_time = 2;
		int is_part_time = 1;
		int emprateperhr = 20;
		double empcheck = Math.floor(Math.random() * 10 ) % 3;
		if(empcheck == is_full_time)
 		{
			int emphrs = 8;
			int salary = (emphrs * emprateperhr);
			System.out.println("salary = " + salary);
		}
		else if(empcheck == is_part_time)
		{
			int emphrs = 4;
                        int salary = (emphrs * emprateperhr);
			System.out.println("salary = " + salary);
		}
		else 
		{
			int salary = 0;
                        System.out.println("salary = " + salary);

		}
	}

}
