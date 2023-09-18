package Packages;
import java.lang.*;
import java.util.Scanner;

public class DetailsCourier extends Registration
{
    String courierAddress;
    Scanner input = new Scanner(System.in);
    
    public void details1(){
        System.out.println("\n\t---------What kinds of Product do you want to Courier?--------- ");
        System.out.println("\n                 1. Medicine.");
        System.out.println("\n                 2. Cosmetics.");
        System.out.println("\n                 3. Electronic Device.");
        System.out.println("\n                 4. Garments Product.");
        System.out.println("\n                 5. Furniture Product.");
        System.out.println("\n                 6. Book Materials.");
        System.out.println("\n                 7. Others.");
        System.out.println("\nEnter Your Choice : (1/2/3/4/5/6/7) ");
        String n = input.nextLine();
        if(n .equals("1")){
            courierAddress();
            System.out.println("\n-------------You Have Selected Medicine\n");
            
        }
        if(n .equals("2")){
          courierAddress();
            System.out.println("\n-------------You Have Selected Cosmetics");
        }
        if(n .equals("3")){
            courierAddress();
            System.out.println("\n-------------You Have Selected Electronic Device");
        }
        if(n .equals("4")){
            courierAddress();
            System.out.println("\n-------------You Have Selected Clothes Product");
        }
        if(n .equals("5")){
            courierAddress();
            System.out.println("\n-------------You Have Selected Furniture Product");
        }
        if(n .equals("6")){
            courierAddress();
            System.out.println("\n-------------You Have Selected Book Materials");
        }
        if(n .equals("7")){
            courierAddress();
            System.out.println("\n-------------You Have Selected Others");
        }
        
        
    }
    public void courierAddress(){
         
        
       
    }
    
    
}