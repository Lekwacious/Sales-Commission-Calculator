package train;
import java.util.Scanner;
public class Commission {

	public static void main(String[] args) {
		double weeklyPay = 200;
		double commission = 0.09;
		int counter = 0;
		double totalSales = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of product sold or -1 to quit");
		double price = input.nextDouble();
		
		while(price != -1 ) {
			totalSales = totalSales + price;
			counter = counter + 1;
		
			System.out.print("Enter the Amount of product sold or -1 to quit");
			price = input.nextDouble();
		}
		if(counter != 0) {
			
		double earnings = totalSales * commission + weeklyPay;
		System.out.printf("This is the total of all the product you sold $%.2f%n", totalSales);
		System.out.printf("This is your total earning this week $%.2f%n", earnings);
	}
		else
			System.out.print("No price of product sold was entered");
	}
}
