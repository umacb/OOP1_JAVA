package Packages;

import java.util.Scanner;

public class Registration 
{
   Scanner input = new Scanner(System.in);
    private String name,address,contactNo,email,location;
    
    String password;
    String re_pass;
    String gender;
    int a, b,c,d;

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getContactNo() {
        return contactNo;
    }
    public String getEmail() {
        return email;
    }
    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    
    public void SignUp() {
    	System.out.println("\t\t|--------------------------------------|");
    	System.out.println("\t\t|             SIGN UP HERE             |");
    	System.out.println("\t\t|--------------------------------------|");
    	System.out.println("\nPlease Confirm your Registration: ");
        System.out.print("Your Name : ");
        name = input.nextLine();
        setName(name);
        System.out.print("Your Gender : ");
        gender = input.nextLine();
        System.out.print("Your Address : ");
        address = input.nextLine();
        setAddress(address);
        System.out.print("You're Contact No. : ");
        contactNo = input.nextLine();
        setContactNo(contactNo);
        System.out.print("You're Email : ");
        email = input.nextLine();
        setEmail(email);

        do {
            a = 0;
            System.out.print(" Set Password : ");
            password = input.nextLine();
            if (password.length() >= 8) {
                System.out.print(" Retype Password : ");
            } else {
                a = 1;
                System.out.println("Minimum Eight(8) Charecters.\nPlease Try Again");
            }
        } while (a == 1);
        do {
            b = 0;
            re_pass = input.nextLine();
            if (password.equals(re_pass)) {
            	System.out.println("\n\n\n                           |*************************************************************************|");
                System.out.println("                           |       Congratulaton, You're Registration is Successfully Completed.    |");
                System.out.println("                           |************************************************************************|");
            } else {
                b = 1;
                System.out.println("Invalid. Please Try Again.");
            }
        } while (b == 1);

    }
    public void showCusDetails() {
        System.out.println("Customer's Name : " + getName());
        System.out.println("Customer's Number : " +getContactNo());
        System.out.println("Customer's Email : " +getEmail());
        System.out.println("Customer's Address : " + getAddress() );
     
}
     
}