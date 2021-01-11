package Asgm3;

import java.util.Scanner;

public class Asgm3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		 
		String[][] custInfo = new String [3][1];
		int[] counter = {0,1,2};
		change(counter);
		
		int custLaptop;
		int quantity=0;
		double laptopprice = 0.00;
		double totalprice=0.00;
		double amount = 0.00;
		double discount=0.00;
		char next=0;
		double pricetopaid=0.00;
		
		laptopBrand();
		
		for (int i=0; i<52; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		System.out.println("Customer Information");
		System.out.print(counter[0] + ". Enter Your Name: ");
		custInfo[0][0] = in.next();
		System.out.print(counter[1] + ". Enter Your IC No: ");
		custInfo[1][0] = in.next();
		System.out.print(counter[2] + ". Enter Your Phone No.: ");
		custInfo[2][0] = in.next();
		
		
		do{
			System.out.println();
			System.out.print("Which Brand of Laptop You Want: ");
			custLaptop = in.nextInt();
			
			if (custLaptop == 1) {
				laptopprice = 3600.00;
			}
				
			else if (custLaptop == 2) {
				laptopprice = 5600.00;
			}
			
			else if (custLaptop == 3) {
				laptopprice = 4500.00;
			}
			
			else if (custLaptop == 4) {
				laptopprice = 2800.00;
			}
			
			else if (custLaptop >=5) {
				System.out.print("Invalid");
			}
			
			System.out.print("Quantity You Want To Buy: ");
			quantity = in.nextInt();
			
			totalprice = laptopprice * quantity;
			
			amount = amount + totalprice;
			
			discount = checkDiscount (amount);
			
			pricetopaid = amount - discount;
			
			System.out.print("Enter Y If You Want Buy Another Brand: ");
			next = in.next().charAt(0);
		} while (next == 'Y' || next == 'y');
		
		int i=0;
		while (i<52) {
			System.out.print("*");
			i++;
		}
		
		System.out.println();
		System.out.println("Customer Name: " + custInfo[0][0]);
		System.out.println("Customer IC: " + custInfo[1][0]);
		System.out.println("Customer Phone Number: " + custInfo[2][0]);
		System.out.println("Amount of Price : RM" + amount);
		System.out.println("Discount 20%: RM" + discount);
		System.out.println("Price Need To Be Paid by Customer: RM" + pricetopaid);

	}
	
	public static void change (int x[]) {
		for (int j=0; j<x.length; j++) {
			x[j]++;
		}
	}
	
	public static void laptopBrand() {
		String[] laptopBrand = {"1.hp" , "2.ASUS" , "3.Acer" , "4.Lenovo"};
		System.out.println("Brand of Laptop We Sell: ");
		for (int i = 0; i < laptopBrand.length; i++) {
			System.out.println(laptopBrand[i]);
		}
	}
	
	
	public static double checkDiscount (double amount) {
		double discount=0.00;
		
		if (amount >= 2500 && amount < 5000) {
			discount = amount * 0.05;
		}
		
		else if (amount >= 5000 && amount <= 7500) {
			discount = amount * 0.10;
		}
		
		else if (amount >= 7500 && amount <= 10000) {
			discount = amount * 0.15;
		}
		
		else if (amount > 10000) {
			discount = amount * 0.20;
		}
		
		return discount;
	}
	
}
