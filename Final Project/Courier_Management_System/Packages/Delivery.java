package Packages;

import java.util.Scanner;

public class Delivery extends DetailsCourier
{
	Scanner input = new Scanner(System.in);
	
	public void details2() 
	{
		if(b<1000) 
		{
			System.out.println("Your Product will be reach to the destination before 3 days");
		}
		else 
		{
			System.out.println("Your Product will be reach to the destination after 7 days");
		}
	}
}
