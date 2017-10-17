
public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		String s = "Description of the graph of: \n" + "y = " + a + "x^2 + " + b + "x + " + c + "\n\n";
		String h = "";
			if (a>0) {
				h = "Up";
			}else if (a<0) {
			h = "Down";
			}	
		s += "Opens: " + h + "\n";
		double symmetry = round2((-b)/(2*a));
		s += "Axis of Symmetry: " + symmetry + "\n";
		double vertex = round2(a * (symmetry*symmetry) + (b *symmetry) + c);
		s+= "Vertex: (" + symmetry + ", " + vertex + ")" + "\n";
		String roots = quadForm(a,b,c);
		s+= "x-intercept(s): "  + roots + "\n";
		s+="y-intercept: " + c + "\n";
		return s;
		}
	public static double discriminant (double b, double a, double c) {
		double discriminant = b*b - 4*a*c;
		return discriminant;
	}
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
	public static double sqrt (double number) {
		double guess= number/10;
		while (guess*guess > number+0.05 || guess*guess < number-0.05) {
		double sqrtOf = 0.5 * (number/guess + guess);
		guess=sqrtOf;
		}
		return round2(guess);
	}
	public static String quadForm(double a, double b, double c) {
		String s = "no real roots";
		double disc = discriminant(a,b,c);
			if (disc < 0) {
				return s;
			}
			else if (disc == 0) {
				double root = -b/(2*a);
				round2(root);
				return "" + root;
			}
			else {
				double root1 = (-b + sqrt(disc)) / (2*a);
				round2(root1);
				double root2 = (-b - sqrt(disc)) / (2*a);
				round2(root2);
			if (root1 < root2) {
				return root1 + " " + root2;
				}
			if (root2 < root1){
				return root2 + " " + root1;
				}
			}
			return s;
		}

}

