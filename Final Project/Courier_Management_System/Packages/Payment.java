package Packages;

import java.util.Scanner;

public class Payment extends Information
{
	Scanner input = new Scanner(System.in);
	int payment;
	
	public final void PM() 
	{
		System.out.println("Dear customer, How would you like to pay your bills?");
		System.out.println("\n1. Paypal");
		System.out.println("2. Visa Card");
		System.out.println("3. Credit Card");
		
		System.out.println("\n\nPlease enter your choice: (1/2/3)");
		int n = input.nextInt();
		if(n==1) 
		{
			System.out.println("\n\nYou have selected PayPal.");
		}
		if(n==2) 
		{
			System.out.println("\n\nYou have selected Visa Card.");
		}
		if(n==3) 
		{
			System.out.println("\n\nYou have selected Credit Card.");
		}		
		
		System.out.println("\n\nPlease enter your amount : ");
		int payment = input.nextInt();
		if (payment == super.T()) 
		{
			System.out.println("\n Payment Completed!!");
		}
		else 
		{
			System.out.println("\ninvalide!!Please pay full amount!!");
		}
	
	}
}
	
