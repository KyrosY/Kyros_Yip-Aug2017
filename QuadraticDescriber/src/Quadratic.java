
public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		String s = "Description of the graph of: \n" + "y = " + a + "x^2 + " + b + "x + " + c + "\n\n";
		String h = "";
		if (a>0) {
			h = "Up";
		}else if (a<0) {
			h = "Down";
		}
		
		s += "Opens: ";
		s += h;
		s += "";
		return s;
			}
}
