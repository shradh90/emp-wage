package java1;

public class java1 {
	public static void main(String[] args) {
		int is_full_time = 2;
		int is_part_time = 1;
		int emprateperhr = 20;
       		int sum = 0;
       		int emphrs = 0;
		for(int i = 0; i < 30; i++) {

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
			int salary = (emphrs * emprateperhr);
			sum =sum + salary; 
                        
		}
		System.out.println("toyal salary = " + sum);
		
 	}
	
}








