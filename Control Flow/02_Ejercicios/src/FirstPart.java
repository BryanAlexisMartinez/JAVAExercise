/*Part 1
 
 */

import java.util.Scanner;

public class FirstPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Write your sales range ");
		double sales = in.nextInt();
		double commission;
		
		if (sales>=0 && sales<=1000) {
			commission = sales * 0;
			System.out.println("Your commission is :" + commission);
		} else if (sales>1000 && sales<=5000) {
			commission = (sales) * (0.1);
			System.out.println("Your commission is :" + commission);
		} else if (sales>5000 && sales<=9999) {
			commission = (sales) * (0.2);
			System.out.println("Your commission is :" + commission);
		} else if (sales>10000) {
			commission = (sales) * (0.3);
			System.out.println("Your commission is :" + commission);
		} else {
			System.out.println("Your sales are negative");
		}
	}
}