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
/*
(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item Value
1 239.99
2 129.75
3 99.95
4 350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.



*/