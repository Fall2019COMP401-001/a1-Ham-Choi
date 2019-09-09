package a1;

import java.util.Scanner;
import java.util.*;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int itemsInStore = scan.nextInt();
		String[] item = new String[itemsInStore];
		double[] item_cost = new double[itemsInStore];
		for (int i = 0; i < itemsInStore; i++) {
			item[i] = scan.next();
			item_cost[i] = scan.nextDouble();
		}
		
		int numberOfCustomers = scan.nextInt();
		String[] firstNames = new String[numberOfCustomers];
		String[] lastNames = new String[numberOfCustomers];
		int numberCustomersB[] = new int[item.length];
		int numberItemsB[] = new int[item.length];
		
		for (int i = 0; i < numberOfCustomers; i++) {
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			int numberOfItems = scan.nextInt();
			String[] listBought = new String[numberOfItems];
			ArrayList <String> counter = new ArrayList<String>();
			
			for (int a = 0; a < numberOfItems; a++) {
				int quantity = scan.nextInt();
				listBought[a] = scan.next();
				for (int b = 0; b < item.length; b++) {
					if (item[b].equals(listBought[a])) {
						numberItemsB[b] = numberItemsB[b] + quantity;
						for  (int c = 0; c < numberOfItems; c++) {
							if (!counter.contains(listBought[a])) {
								counter.add(listBought[a]);
								numberCustomersB[b]++;
								break;
							}
						}
					}
				}
			}
		}
		scan.close();
		
		for (int i = 0; i < itemsInStore; i++) {
			if (numberCustomersB[i] == 0 || numberItemsB[i] == 0) {
				System.out.println("No customers bought " + item[i]);
			} else {
				System.out.println(numberCustomersB[i] + " customers bought "
			+ numberItemsB[i] + " " + item[i]);
			}
		}
		
		// Your code follows here.
		
	}
}
