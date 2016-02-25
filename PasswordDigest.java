import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class PasswordDigest{
	public static void main ( String[] args ) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		String pw, hash;

		MessageDigest digest = MessageDigest.getInstance("SHA-256");

		System.out.print("Password: ");
		pw = keyboard.nextLine();

		digest.update( pw.getBytes("UTF-8") );
		hash = DatatypeConverter.printHexBinary( digest.digest() );

		System.out.println( hash );	
	}
}






/* Drill:
	1.  getInstance: Returns a MessageDigest object that implements the specified digest algorithm.
		getBytes: Encodes this String into a sequence of bytes using the given charset, storing the result into a new byte array.
		update: Updates the digest using the specified array of bytes.
		printHexBinary: Converts an array of bytes into a string.


	2.Delete throws Exception.
		Program does not compile and prints the following to the console. 

		PasswordDigest.java:10: error: unreported exception NoSuchAlgorithmException; must be caught or declared to be thrown
				MessageDigest digest = MessageDigest.getInstance("SHA-256");
				                                                ^
		PasswordDigest.java:15: error: unreported exception UnsupportedEncodingException; must be caught or declared to be thrown
				digest.update( pw.getBytes("UTF-8") );


*/