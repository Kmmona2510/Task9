package task9;

import java.util.Scanner;

public class Qfour {

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value:");
      int n=sc.nextInt();
       // Printing the upper part
        for (int i = 1; i <= n; i++) {
            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print value of j.
            for (int j = i; j <= n; j++) {
                System.out.print("*" + " ");
            }
 
            // printing new line for each row
            System.out.println();
        }
 
        // Printing the lower part
        for (int i = n - 1; i >= 1; i--) {
            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (int j = i; j <= n; j++) {
                System.out.print("*" + " ");
            }
            // printing new line for each row
            System.out.println();        


	}	

	}}
