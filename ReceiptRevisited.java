import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
	public static void main( String[] args ) throws Exception{
		PrintWriter fileout = new PrintWriter("receipt.txt");
		Scanner keyboard = new Scanner(System.in);

		double ppg = 3.00;
		double gal = 0;
		double total = 0;

		System.out.println("Gas costs: " + ppg );
		System.out.print("How many gallons do you want? ");
		gal = keyboard.nextDouble();

		total = gal*ppg;

		System.out.print("Total Cost: " + total );

		System.out.println("\nWriting customized receipt to 'receipt.txt'... done.");



		fileout.println( "+---------------------+");
		fileout.println( "                     " );
		fileout.println( "    Corner Store     " );
		fileout.println( "                     " );
		fileout.println( " 2014-06-25 04:38PM  " );
		fileout.println( "                     " );
		fileout.println( " Gallons: " + gal );
		fileout.println( " Price/gallon: " + ppg );
		fileout.println( "                     " );
		fileout.println( " Fuel total: " + total );
		fileout.println( "                     " );
		fileout.println( "+---------------------+");
		fileout.close();
	}
}