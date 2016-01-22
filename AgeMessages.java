import java.util.Scanner;

public class AgeMessages{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);

		int age;

		System.out.print( "How old are you? ");
		age = keyboard.nextInt();

		System.out.println( "you are: " );

		if ( age < 13 ) {
			System.out.println( "\ttoo young to create a Facebook account" );
		}
		else {
			System.out.println( "\told enough for facebook");
		}



		if ( age < 16 ) {
			System.out.println( "\ttoo young to get a driver's license" );
		}
		else {
			System.out.println( "\told enough to get a driver's lecense");
		}


		
		if ( age < 18 ) {
			System.out.println( "\ttoo young to get a tattoo" );

		}
		else {
			System.out.println( "\told enough to get a tattoo");
		}



		if ( age < 21 ){
			System.out.println("\ttoo young to drink alcohol" );
		}
		else {
			System.out.println("\told enough to drink!");
		}


		if ( age < 35 ){
			System.out.println("\ttoo young to run for President of the U.S.");
			System.out.println("\t\t(How sad!)" );
		}
		else{
			System.out.println("\told enought to run for president");
		}


		if (age>65){
			System.out.println("\tYou are old enough to retire!");
		}
		else{
			System.out.println("\tnot old enough to retire");
		}

	}
}

/* Drill answers:
	1. prints "you are: " because no conditions were met*/
	