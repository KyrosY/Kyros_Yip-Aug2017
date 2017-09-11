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
}

	
