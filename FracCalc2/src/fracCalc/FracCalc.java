package fracCalc;

import java.util.Scanner;

public class FracCalc {
    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userInput = new Scanner(System.in);
    	boolean done = false;
    	while(!done) {
    		System.out.println("Enter your input: ");
    		String equation = userInput.nextLine();
    		System.out.println(Fraction.produceAnswer(equation));
    		System.out.println("keep going?");
    		String s = userInput.next();
    		if (s.charAt(0) == 'q'){
    			done = true;
    		}
    	}
    	userInput.close();
    }


}
