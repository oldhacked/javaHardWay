import java.util.Scanner;

public class HighLow{
	public static void main( String[] args){
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;

		secret = 1 + (int)(Math.random()*100);

		System.out.println( "I'm thinking of a number between 1-100." );
		System.out.println( "Try to guess it!!!");
		System.out.print("> ");
		guess = keyboard.nextInt();

		while ( secret != guess ){
			if ( guess < secret ){
				System.out.println( "Sorry your guess is too low. \nTry again.");
			}
			if ( guess > secret ){
				System.out.println( "Sorry your guess is too high. \nTry again.");
			}
			System.out.print( "> " );
			guess = keyboard.nextInt();
		}

		System.out.println( "....good ....job ..you guessed it. ");

	}
}