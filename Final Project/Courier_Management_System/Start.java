import Packages.*;
public class Start 
{
	public static void main (String [] args) 
	{		
		System.out.println("                   -----------------------------------------                     ");
    	System.out.println("*******************WELCOME TO DHL WORLD WIDE COURIER SERVICE*******************");
    	System.out.println("                   -----------------------------------------                     ");
    	System.out.println("DHL is the global leader in the logistic industries. Specially in international shipping, courier service and transport\n\n");
    	
		Registration r = new Registration();
		Delivery d = new Delivery();
	    DetailsCourier x = new DetailsCourier();
		Payment z = new Payment();
		
		BillReport c ;
	    c = new Information();
	    		
		r.SignUp();
		x.details1();
		c.sendInfo();
		d.details2();
		r.showCusDetails();
		z.PM();
		
		DeliveryExecutive dp = new DeliveryExecutive();
		dp.FB();
	    dp = new Feedback();
		dp.FB();	
	}

}
