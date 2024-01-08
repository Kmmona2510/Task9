package task9;

import java.util.Scanner;

public class Qtwo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		// get string from user
		String st=sc.nextLine();
		String re="";  //for reverse initialize the string
		
		int len =st.length(); //to check length of the string
		for(int i=len-1;i>=0;i--)  //iterate
			
			re=re+st.charAt(i); //add the character for reverse order
		
			System.out.println("The reverse String is:" +re);
		
		
			
		

	}

}
