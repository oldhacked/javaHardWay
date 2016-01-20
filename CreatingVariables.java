public class CreatingVariables{
	public static void main( String[] args){
		int x, y, age, flatulence;
		double seconds, e, checking, mouthbreathing;
		String firstName, lastName, title, diagnosis, result ;

		flatulence = 7;
		x = 10;
		y = 400;
		age = 39;
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		mouthbreathing = 8;


		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		diagnosis = "mesophonic";
		result = "nightmare";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y.");
		System.out.println( "The experiment took " + seconds + " seconds.");
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!");
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "Enduring " + flatulence + " hours of flatulence + " + mouthbreathing + " hours of mouthbreathing is a " + diagnosis + "\'s " 
			+ result );
		
	}
}