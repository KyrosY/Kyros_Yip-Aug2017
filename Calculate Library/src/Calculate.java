/* Kyros Yip
 * September 5, 2017
 * This is our homegrown library that will contain various mathematical methods.
*/
public class Calculate {
	
/*This method takes an integer and returns its square.
 * 
 */
	public static int square (int operand) {
		return operand * operand;
	}
	public static int cube (int operand) {	
		return operand * operand * operand;
	}	
	public static double average (double operand1, double operand2) {
		double average = (operand1 + operand2)/2;
		return average;
	}
	public static double average (double operand1, double operand2, double operand3) {
		double average = (operand1 + operand2 + operand3)/3;
		return average;
	}
	public static double toDegrees (double radian) {
		double degree = ((radian * 100)/3.14159);
		return degree;
	}
	public static double toRadians (double degree) {
		double radian = ((3.14159*degree)/100);
		return radian;
	}
	public static double discriminant (double b, double a, double c) {
		double discriminant = b*b - 4*a*c;
		return discriminant;
	}
	public static String toImproperFrac (int whole, int den, int num) {
		int immproper = (whole * den + num);
		return improper +"/"+ num;
	}
	//This method converts an improper fraction into a mixed number
	public static String toMixedNum (int num, int den) {
		int improper = num/den;
		int remainder = num%den;
		return improper + "_" + remainder + "/" + den;
	}
	//This method converts the form (ax + b)(cx + d) into a quadratic equation
	public static String foil (int a, int b, int c, int d, String n) {
		return (a * c) + ("n^2") + " + " + (a * d + b * c) + "n" + " + " + (b * d);
	}
	//Part 2
	//This method determines if one method is divisible by another
	public static boolean isDivisibleBy(int num, int den) {
		return num % den ==0;
	}
	//This method determines the absolute value
	public static double absValue (double operand){
		if (operand >= 0) {
		return operand;
		}
		if (operand < 0){
		return operand + (operand * -2);
		}
		return operand;
	}
	//This method returns the larger of two values
	public static double max(double operand1, double operand2){
		if (operand1 > operand2) {
		return operand1;
		}
		if (operand2 > operand1){
		return operand2;
		}
		return operand2;
	}
	//This method returns the larger of three values
	public static double max (double operand1, double operand2, double operand3){
		if (operand1 > operand2 && operand1 > operand2) {
		return operand1;
		}
		if (operand2 > operand1 && operand2 > operand3){
		return operand2;
		}
		if (operand3 > operand2 && operand3 > operand1) {
		return operand3;
		}
		return operand3;
	}
	//This method returns the smaller of two values
	public static int min (int operand1, int operand2){
		if (operand1 < operand2) {
		return operand1;
		}
		if (operand2 < operand1){
		return operand2;}
		return operand2;
	}
		/*public static double round (double rounding) {
			int number = (int) (rounding * 100);
			double number2 = number / 100;
			return number2;
		}
		 */
	//This method rounds to two decimal places
	public static double round2(double orig) {
		double result = 0.0;
		int tempInt = (int) (orig * 1000);
		int roundNum = tempInt % 10;
		tempInt = tempInt / 10;
		if (roundNum >= 5 && tempInt > 0)
			tempInt++;
		else if(roundNum <= -5 && tempInt <0)
			tempInt--;
		result= tempInt / 100.0;
		return result;
	}
	//Part 3
	//This method raises a value to a positive integer power
	public static double exponent(double base, int power) {
		double product = base;
		for (int n = 1; n <= power; n++) {
		product = product * base;
	}
		return product / base;
	}
	//This method returns the factorial
	public static int factorial (int operand) {
		int product = 1;
	for (int n = 1; n <= operand; n++) {
		product = product * n;
	}
	return product;
	}
	//This method tests whether or not a number is prime
	public static boolean isPrime (int operand) {
		int n = 2;
		while (!isDivisibleBy (operand, n));
			n++;
		} 
		if (n == operand) {
			return true ;
		}
		else {
			return false;
		}
	}
	
	//This method finds the greatest common factor of two integers
	/*public static int gcf (int operand, int operand2) {
		isDivisibleBy(operand, operand2);		
		
	}
	*/
	//This method finds the square root of a value rounded to two decimal places
	/*public static double sqrt (double number) {
		double sqrtOf = 0.5 * (number/ + );
		
		Calculate.round2(sqrtOf);
		return sqrtOf;
	}
	*/
}

}

	
