package java2;

import java.util.Scanner;

public class empwage {
	int is_full_time = 2;
	int is_part_time = 1;
	int emprateperhr = 20;
	 System.out.println("enter number of workinf days :	");
	 Scanner sc = new Scanner(System.in);
   	 int d = sc.nextInt();
   	 System.out.println("enter number of working hrs in month :	");
	 Scanner sc1 = new Scanner(System.in);
   	 int h = sc1.nextInt();
   	 int sum = 0;
   	 int totalworkingdays;
   	 int emphrs = 0;
   	 while((sum <= h) && (totalworkingdays < d)) {
   		for(int i = 0; i < 30; i++) {
            totalworkingdays++;
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
}
