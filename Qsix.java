package task9;

import java.util.Scanner;

public class Qsix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of month:");//declare month as integer
		int month = sc.nextInt();
		System.out.println("Enter the Room rent per day:");//declare rent as float
		float rent=sc.nextFloat();
		System.out.println("Enter of days in hotel:");//declare days in integer
		int days = sc.nextInt();
		float tariff; //total amount tariff declaration
		switch(month) {
		case 4:
			tariff =(rent+20%100)* days;   //condition given to question
			System.out.println("Its a April");
			System.out.println(tariff);
			break;
			case 5:
				tariff =(rent+20%100)* days;
				System.out.println("Its a May");
				System.out.println(tariff);
				break;
			case 6:
				tariff =(rent+20%100)* days;
				System.out.println("Its a June");
				System.out.println(tariff);
				break;
			case 11:
				tariff =(rent+20%100)* days;
				System.out.println("Its a November");
				System.out.println(tariff);
				break;
			case 12:
				tariff =(rent+20%100)* days;
				System.out.println("Its a December");
				System.out.println(tariff);
				break;
			default:  //without condition
			tariff = rent *days;
			System.out.println(tariff);
		}
			
		
	

	}

}
