package Packages;

import java.util.Scanner;

public class Information extends BillReport 
{
	String a;
	int b;
	Scanner input = new Scanner(System.in);
	
	@Override
	public void sendInfo(){
		
		
		 

		System.out.println("\n\nWhere do you want sent you're Product?");
        String a = input.nextLine();
	    System.out.println("\n\nHow much weight of your products? (K/G)");
	    int b = input.nextInt();
		   	    
		System.out.println("\n*******************Thanks for your Information. Your response was submiitted*******************");
		   	    
		System.out.println("\n\n-----------------CUSTOMER's AND PRODUCT's INFORMATION-----------------");
		System.out.println("__________________________________________________________________________");
		   	    
	    System.out.println("Customer's Product's Destination is : "+a);
		System.out.println("Customer's Product weight is : " + b + "KG");
				
				
		T();
				
		System.out.println("Your Total Bill is : " + T + "TK only (BDT) with delivery charge");
		 }
	
	int T() {
		T = ((b*100)+1000);
		return T;
	}
	}
