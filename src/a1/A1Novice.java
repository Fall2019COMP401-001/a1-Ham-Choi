package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfCustomers = scan.nextInt();
		for (int i = 0; i < numberOfCustomers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int number = scan.nextInt();
			double total = 0;
			for (int a = 0; a < number; a++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				total += quantity * price;				
			}
			System.out.println(firstName.charAt(0) + ". " + lastName + 
					": " + String.format("%.2f", total));
		}
		scan.close();
		//done
	}
}
