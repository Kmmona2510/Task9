package task9;

import java.util.Scanner;

public class Qthree {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();       // get integer from customer
				
		
		int k=1;             // initialize the value
		
		for(int i=1; i<=num;i++) {            // for row iteration
			for(int j=1;j<=i;j++) {          // for column iteration
				
				System.out.print(k +"");        // print value
				k++;                  //increament the value
						
			}System.out.println("");   // for next line 
		}
	}
	
	}
	           
	            