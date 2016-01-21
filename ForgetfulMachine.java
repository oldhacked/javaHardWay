import java.util.Scanner;

public class ForgetfulMachine{
	public static void main( String[] Args){
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "What is the capital of France?" );
		keyboard.next();

		System.out.println( "what is 6 multiplied by 7?" );
		keyboard.nextInt();

		System.out.println( "Enter a number between 0.0 and 1.0.? ");
		keyboard.nextDouble();

		System.out.println( "Is there anything else you would like to say? ");
		keyboard.next();
	}

}
//2nd question blows up when you type something other than an int 
//3rd question blows up when you dont type a double 