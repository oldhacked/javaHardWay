import java.util.Scanner; 

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, insult;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

 		System.out.print( "Hello. What is your name? " );
 		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();

		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		

		System.out.print( "oh one more thning... whats your favorite curse word? ");
		insult = keyboard.next();

		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( insult + " face " + name + "." );

	}
}
/*The program does not blow up if an iteger value is typed in a place where a double is expected. 
	My guess is that it converts the integer into a double by adding a decimal point at the end.

  The program does not blow up if a integer value is typed in a place where a string is expected.
  	My guess is that it accepts it as a part of the character set but has no value. 

  The program, at its current state, does not accept strings with spaces in places where strings are expected.
  	Maybe there is some ignore space function or other setting that can be applied to the string variable when 
  	its declared that will allow it to accept spaces. 

  Entering string values when integers or doubles are expected,
*/