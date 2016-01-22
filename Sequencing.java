import java.util.Scanner; 

public class Sequencing {
	public static void main( String[] args ) {

	// THIS CODE IS BROKEN UNTIL YOU FIX IT
	 Scanner keyboard = new Scanner(System.in);
	 double price, salesTax, total;

	 System.out.print( "How much is the purchase price? " );
	 price = keyboard.nextDouble();

	 salesTax = price * 0.0825;
	 total = price + salesTax;

	 System.out.println( "Item price:\t" + price );
	 System.out.println( "Sales tax:\t" + salesTax );
	 System.out.println( "Total cost:\t" + total );

	}

}
/* I learned in this lesson that variables can be declared but they are not defined unless they are initialized or are passed a value 
	and that variables can not store formulas or work properly if the value of a variable is not initialized. In other words
	now that salesTax and total follows after the line where price is given a value, they are no longer empty formulas. */