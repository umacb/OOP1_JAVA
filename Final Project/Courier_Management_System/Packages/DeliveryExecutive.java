package Packages;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
  
public class DeliveryExecutive {
	Scanner input = new Scanner(System.in);
	int R;
	int count ;
	
	public void FB() {
		
		do {
			count = 0;
			try {
				
				System.out.println("\n\n\nDear Customer your product has reached it's destination............... \nLet us know is there any damage of your product?");
			    System.out.println("\n\n----------Has there been any damage of your product?\n1. Yes\n2. No");
			    Scanner input = new Scanner(System.in);
			    int R = input.nextInt();
			    if(R==1) {
			    	System.out.println("We are really sorry to hear about that. We will fix our problem asap!!");
			    }
			    else if(R==2) {
			    	System.out.println("Thanks for your feedback!!!!");
			    	
			    }
			    else {
			    	count = 1;
			    	System.out.println("You must enter number. Please try again");
			    }
			    
			   
			}
			    catch (Exception e) {
			    	System.out.println("Exception : " + e);
			    	count = 1;
			    	System.out.println("You must enter number. Please try again");
			    }
			}
		while (count == 1);
		
		}

}