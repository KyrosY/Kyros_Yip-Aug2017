import java.util.Scanner;

public class QuadraticClient {
	public static void main (String [] args) {
		boolean done = false;
		do {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for the coefficients a, b, and c");
		System.out.println();
		System.out.println("a: ");
		double a = userInput.nextDouble();
		System.out.println("b: ");
		double b = userInput.nextDouble();
		System.out.println("c: ");
		double c = userInput.nextDouble();
		System.out.println(Quadratic.quadrDescriber(a, b, c));
		System.out.println("Do you want to keep going? (Type \"quit\" to end)");
		String s = userInput.next();
		if (s.charAt(0) == 'q'){
			done = true;
		} 
		} while (!done);
		
		}	
	}