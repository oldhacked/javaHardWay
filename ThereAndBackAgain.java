public class ThereAndBackAgain{
	public static void main(String[]args){
		System.out.println("Here.");
		erebor();
		System.out.println("Back first time.");
		//erebor();
		System.out.println("Back second time.");

	}
	public static void erebor() {
		System.out.println( "There.");
	}
}

/*Drill:
	1.Removing the perens on the first function call causes it not to compile
	 and states an error saying that it is not a statement. Commenting out the
	 second function called in the main funcion casuses it not to call the funciton. 

*/