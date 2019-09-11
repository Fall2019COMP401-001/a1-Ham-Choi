package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int itemsInStore = scan.nextInt();
		String[] item = new String[itemsInStore];
		double[] item_cost = new double[itemsInStore];
		for(int i = 0; i < itemsInStore; i++) {
			item[i] = scan.next();
			item_cost[i] = scan.nextDouble();
		}
		
		int numberOfCustomers = scan.nextInt();
		String[] firstNames = new String[numberOfCustomers];
		String[] lastNames = new String[numberOfCustomers];
		double[] total = new double[numberOfCustomers];
		
		for (int i = 0; i < numberOfCustomers; i++) {
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			int numberOfItems = scan.nextInt();
			for (int a = 0; a < numberOfItems; a++) {
				int quantity = scan.nextInt();
				String product = scan.next();
				for (int b = 0; b < item.length; b++) {
					if (item[b].equals(product)) {
						total[i] = total[i] + quantity * item_cost[b];
					}
				}
			}
		}
		double biggestValue = 0;
		double smallestValue = 100;
		double sum = 0; 
		double average;
		
		for (int i = 0; i < total.length; i++) {
			if (total[i] > biggestValue) {
				biggestValue = total[i];
			}
			if (total[i] < smallestValue) {
				smallestValue = total[i];
			}
			sum = sum + total[i];
		}
		
		average = sum/total.length;
		int biggestItem = 0;
		int smallestItem = 0;
		for (int i= 0; i < numberOfCustomers; i++) {
			if (biggestValue == total[i]) {
				biggestItem = i;
			}
			if (smallestValue == total[i]) {
				smallestItem = i;
			}
		}
		scan.close();
		
		System.out.println("Biggest: " + firstNames[biggestItem] + 
				" " + lastNames[biggestItem] + " (" + String.format("%.2f", 
						total[biggestItem]) + ")");
		System.out.println("Smallest: " + firstNames[smallestItem] + 
				" " + lastNames[smallestItem] + " (" + String.format("%.2f", 
						total[smallestItem]) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	}
	
}
