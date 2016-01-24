import java.util.Scanner;

public class GenderTitles {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String title = error;

		System.out.print( "First name: " );
		String first = keyboard.next();
		System.out.print( "Last name: " );
		String last = keyboard.next();
		System.out.print( "Gender (M/F): " );
		String gender = keyboard.next();
		System.out.print( "Age: " );
		int age = keyboard.nextInt();

		if ( age < 20 ) {
			title = first;
		}
		else {
			if ( gender.equals("F") ) {
				System.out.print( "Are you married, "+first+"? (Y/N): " );
				String married = keyboard.next();
				if ( married.equals("Y") ) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}
			else {
				title = "Mr.";
			}
		}

		System.out.println( "\n" + title + " " + last );
	}
}

/* Drill
	The drill asked to see what happens when else on line 31 is replaced with an if condition. 
	It does not compile and states the title is not defined.

	From my understanding, due to the nature of the nested if statements in this example, 
	the compiler requires a guarantee that the condition is resolved. Replacing else with if 
	somehow negates that guarentee. I guess its leaving the door open to a user's input not meeting
	one of the requirements...

*/