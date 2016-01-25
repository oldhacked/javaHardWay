import java.util.Scanner;

public class RunningTotal {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int current = 1, total = 0;

		System.out.print("Type in a bunch of values and I'll add them up. ");
		System.out.println("I'll stop when you type a zero.");

		do{
			System.out.print("Value: ");
			current = keyboard.nextInt();
			total += current;

			if( current != 0 ){
				System.out.println("The total so far is: " + total);
			}

		} while ( current != 0 );

		

		System.out.println("The final total is: " + total);
	}
}

/* Drill
	1. To convert this to a while loop, remove the while condition that follows the body of the do code
	and replace the do with the while condition. to get it to compile, it needs to be initialized to any number 
	other than zero since it will be overwritten by the user input that is stored into it in loop. 
	
	2. To prevent "the total so far" from being printed out when the final total is printed, an
	if statement is placed in the do while body.
	
*/