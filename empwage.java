





public class empwage {
	public static void main(String[] args) {
		int is_full_time = 2;
		int is_part_time = 1;
		int emprateperhr = 20;
       		int sum = 0;
		for(int i = 0; i <= 30; i++) {

			double empcheck = Math.floor(Math.random() * 10 ) % 3;
			if(empcheck == is_full_time)
 			{
				int emphrs = 8;
				int salary = (emphrs * emprateperhr);
                           	sum = sum + salary;
				System.out.println("salary = " + salary);
			}
			else if(empcheck == is_part_time)
			{
				int emphrs = 4;
                        	int salary = (emphrs * emprateperhr);
				sum = sum + salary;
				System.out.println("salary = " + salary);
			}
			else 
			{
			int salary = 0;
			sum =sum + salary;
                        System.out.println("salary = " + salary);
			}
		}
 	}
}





























public class empwage {
	public static void main(String[] args) {
		int is_full_time = 2;
		int is_part_time = 1;
		int emprateperhr = 20;
		int empcheck = (int) (Math.floor(Math.random() * 10 )) % 3;
		int emphrs;
		int salary;
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
 		salary = (emphrs * emprateperhr);
                System.out.println("salary = " + salary);

 	}
}









