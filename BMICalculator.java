import java.util.Scanner;

public class BMICalculator{
	public static void main( String[] args){
		Scanner keyboard = new Scanner (System.in);
		double m, kg, bmi, ft, in, lbs, inTotal;

		System.out.print( "Your height (feet only): ");
		ft = keyboard.nextDouble();

		System.out.print( "Your height (remaining inches): ");
		in = keyboard.nextDouble();

		System.out.print( "Your weight in lbs: ");
		lbs = keyboard.nextDouble();


		inTotal = (ft*12) + in;

		m = inTotal*0.0254;

		kg = lbs*0.453592;
		
		bmi = kg / ( m*m );

		System.out.println( "your BMI is " + bmi );

	}

}