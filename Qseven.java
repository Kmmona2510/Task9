package task9;

import java.util.Scanner;

public class Qseven {

	public static void main(String[] args) {
		// Largest of three numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1:");//getting the values
		int num1 = sc.nextInt();
		System.out.println("Enter Number2:");
		int num2 = sc.nextInt();
		System.out.println("Enter Number3:");
		int num3 =sc.nextInt();
		if(num1>num2 && num1> num3) { // check num1 is greater
			System.out.println("Number1 is Largest");
					}else if(num2>num1 && num2>num3){ //check num2 is greater
						System.out.println("Number2 is Largest");
						
					}else {  //num1 ,num2 not greater print value
						System.out.println("Number3 is Largest");
					}
		

	}

}
