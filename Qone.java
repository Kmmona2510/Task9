
package task9;

import java.util.Scanner;

public class Qone {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String:");
		
		String num = sc.nextLine(); //getting string from user
		 String a = "";
		int len = num.length(); //for know the string iteration length method used
		for(int i=len-1;i>=0;i--)  // iterate the character
			a= a+num.charAt(i);
			if(num.equals(a)) {  //check the string
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not a palindrome");
			}
		}
		
		
		
		
		
		

	

}
