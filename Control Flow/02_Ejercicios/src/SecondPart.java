import java.util.Scanner;

public class SecondPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = in.nextInt();
		double discount;
		double finalPrice;
		
		if (age<5) {
			discount = 7 * .6;
			finalPrice = 7 - discount;
			System.out.println("The final price of your ticket is: " + finalPrice + " Euros");
		} else if (age > 60) {
			discount = 7 * .55;
			finalPrice = 7 - discount;
			System.out.println("The final price of your ticket is: " + finalPrice + " Euros");
		} else {
			System.out.println("The final price of your ticket is 7 euros.");
		}
	}
}