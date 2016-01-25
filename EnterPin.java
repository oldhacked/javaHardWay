import java.util.Scanner;

public class EnterPin{
	public static void main( String[] args){
		Scanner keyboard = new Scanner(System.in);

		int pin, entry2;
		String entry1, passcode;
		

		passcode = "derp";

		System.out.println("WELCOM TO THE BANK OF JAVA!");
		System.out.println("ENTER YOUR PASSWORD");
		entry1 = keyboard.next();

		while ( ! entry1.equals("derp")){
				System.out.println("\n WROOONNGNGGG!!!! GIVE IT ANOTHER TRY BROHAMLET...");
				System.out.println("\n ENTERY YOUR PASSWORD!!");
				entry1 = keyboard.next();
		}

		pin = 12345;

		System.out.println("WORD UP... NOW ENTER YOUR PIN: ");
		entry2 = keyboard.nextInt();

		while ( entry2 != pin ){
			System.out.println("\nINCORRECT PIN. TRY AGAIN. ");
			System.out.println("ENTER YOU PIN");
			entry2 = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $5,000,000.01 \n hook me up with some of that cash flow! ");
	}
}




