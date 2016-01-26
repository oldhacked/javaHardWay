import java.util.Scanner;

public class PigDice {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int roll, ptot, ctot, turnTotal, test;
		String choice = "";

		ptot = 0;
		ctot = 0;

		do {
			turnTotal = 0;
			System.out.println( "You have " + ptot + " points." );

			do {
				roll = 1 + (int)(Math.random()*6);
				System.out.println( "\tYou rolled a " + roll + "." );
				if ( roll == 1 ) {
					System.out.println( "\tThat ends your turn." );
					turnTotal = 0;
				}
				else {
					turnTotal += roll;
					System.out.print( "\tYou have " + turnTotal + " points" );
					System.out.print( " so far this round.\n" );
					System.out.print( "\tWould you like to \"roll\" again" );
					System.out.print( " or \"hold\"? " );
					choice = keyboard.next();
				}
			} while ( roll != 1 && choice.equals("roll") );

			ptot += turnTotal;
			System.out.println("\tYou end the round with " + ptot + " points.");

			if ( ptot < 100 ) {
				turnTotal = 0;
				System.out.println( "Computer has " + ctot + " points." );

				do {
					roll = 1 + (int)(Math.random()*6);
					System.out.println( "\tComputer rolled a " + roll + "." );
					if ( roll == 1 ) {
						System.out.println( "\tThat ends its turn." );
						turnTotal = 0;
					}
					else {
						turnTotal += roll;
						System.out.print( "\tComputer has " + turnTotal );
						System.out.print( " points so far this round.\n" );
						if ( turnTotal < 20 && turnTotal + ctot < 100 ) {
							System.out.println( "\tComputer will roll again." );
							test = turnTotal + ctot;
							System.out.println("\nturnTotal + computer total = " + test+"\n");
						}
					}
				} while ( roll != 1 && (turnTotal < 20 && turnTotal + ctot < 100));

				ctot += turnTotal;
				System.out.print( "\tComputer ends the round with " );
				System.out.print( ctot + " points.\n" );
			}

		} while ( ptot < 100 && ctot < 100 );

		if ( ptot > ctot ) {
			System.out.println( "Humanity wins!" );
		}
		else {
			System.out.println( "The computer wins." );
		}
	}
}

/* Drill:
	The drill asked to make the computer less risky and hold if it gets close to 100. 

		To prevent any extra rolls once it has reached 100 I added some code to the do while loop condition statement on line 57
		(and the print out on line 51):
			"&& turnTotal + ctot < 100"
		
		This allows it to compare its curent turn score with its total score to ensure it does not make any unneccessary rolls
		once it has reached 100 versus relying only on the condition of meeting a turnTotal of 20.  

		To test it I had the program print out the results of the code: 

			Computer has 87 points.
			Computer rolled a 2.
			Computer has 2 points so far this round.
			Computer will roll again.

		turnTotal + computer total = 89

			Computer rolled a 3.
			Computer has 5 points so far this round.
			Computer will roll again.

		turnTotal + computer total = 92

			Computer rolled a 6.
			Computer has 11 points so far this round.
			Computer will roll again.

		turnTotal + computer total = 98

			Computer rolled a 5.
			Computer has 16 points so far this round.
			Computer ends the round with 103 points.
		The computer wins.

*/