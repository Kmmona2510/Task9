package task9;

import java.util.Scanner;

public class Qfive {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the marks:");
		int mark=sc.nextInt();            // get mark from user
		if(mark==100) {
			System.out.println("The Grade is S");
		}else if(mark>=90 && mark<=99){     // check the condition given in question
			
			System.out.println("The Grade is A");  //print the value
			
		}else if(mark>=80 && mark<=89){
			
			System.out.println("The Grade is B");
			
		}else if(mark>=70 && mark<=79){
			
			System.out.println("The Grade is C");
			
		}else if(mark>=60 && mark<=69){
			
			System.out.println("The Grade is D");
		}
			else if(mark>=50 && mark<=59){
				
				System.out.println("The Grade is E");
				
			}
			else {
				System.out.println("The Grade is F");
			}
			
		}
		
		
		

	}


