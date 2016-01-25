import java.util.Scanner;

public class KeepGuessing {
	public static void main( String[] args){
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;

		secret = 1 + (int)(Math.random()*10);

		System.out.println( "I have chosen a number between 1 and 10." );
		System.out.println( "Try to guess it." );
		System.out.print( "Your guess: " );
		guess = keyboard.nextInt();

		while ( secret != guess ){
			if ( guess < secret ){
				System.out.println( "Sorry your guess is too low. \nTry again.");
			}
			if ( guess > secret ){
				System.out.println( "Sorry your guess is too high. \nTry again.");
			}
			System.out.print( " Guess! > ");
			guess = keyboard.nextInt();
		}

		System.out.println( "That's right! You're a good guesser." );

	}
}