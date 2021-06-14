public class empwage {
	public static void main(String[] args) {
		int is_full_time = 2;
		int is_part_time = 1;
		int emprateperhr = 20;
		int empcheck = (int) (Math.floor(Math.random() * 10 )) % 3;
		int emphrs = 0;
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









