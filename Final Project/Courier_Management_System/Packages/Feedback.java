package Packages;

import java.util.Scanner;
import java.io.File;

public class Feedback extends DeliveryExecutive {
	Scanner input = new Scanner(System.in);
	int X;
	
	@Override
	public void FB() {
		System.out.println("\n\n\nPlease give feedback about our Courier Management System.");
		System.out.println("      1.  Excellent");
		System.out.println("      2.  Very Good");
		System.out.println("      3.  Good");
		System.out.println("      4.  Not Bad");
		System.out.println("      5.  Bad");
		System.out.println("      6.  Disappointed");
		
		int X = input.nextInt();
			try {
				File file = new File ("C:\\Users\\Aditya\\Desktop\\Project.txt");
				Scanner scanner = new Scanner(file);
				
				while (scanner.hasNext()) {
					String R = scanner.next();
					System.out.println(R);
					}
				scanner.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}