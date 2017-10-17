
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
		s += h + "\n";
		double symmetry = (-b)/(2*a);
		double result = 0.0;
		int tempInt = (int) (symmetry * 1000);
		int roundNum = tempInt % 10;
		tempInt = tempInt / 10;
			if (roundNum >= 5 && tempInt > 0) {
				tempInt++;
		}
			else if(roundNum <= -5 && tempInt <0) {
				tempInt--;
		}
		result= tempInt / 100.0;
		s += "Axis of Symmetry: ";
		s+= result + "\n";
		s+= "Vertex: ";
		double vertex = a * (symmetry*symmetry) + (b *symmetry) + c;
		double vertexResult = 0.0;
		int temporaryInt = (int) (vertex * 1000);
		int roundNumber = tempInt % 10;
		temporaryInt = temporaryInt / 10;
			if (roundNumber >= 5 && temporaryInt > 0) {
				temporaryInt++;
			}
			else if(roundNumber <= -5 && temporaryInt <0) {
				temporaryInt--;
			}
			vertexResult= temporaryInt / 100.0;
		s+= "<" + symmetry + ", " + vertexResult + ">" + "\n";
		String roots = "";
		double disc = b*b - 4*a*c;
			if (disc < 0) {
				roots = "No real roots";
			}
			else if (disc == 0) {					
				roots = "" + symmetry;
				}
			else {
				double guess= disc/10;
				while (guess*guess > disc+0.05 || guess*guess < disc-0.05) {
					double sqrtOf = 0.5 * (disc/guess + guess);
					guess=sqrtOf;
				}
				double first = 0.0;
				int number = (int) (guess * 1000);
				int rounded = number % 10;
				number = number / 10;
					if (rounded >= 5 && number > 0) {
						number++;
					}
					else if(rounded <= -5 && number <0) {
						number--;
					}
					first= number / 100.0;
				double root1 = (-b + first) / (2*a);
				double resultant = 0.0;
				int number1 = (int) (root1 * 1000);
				int rounding = number1 % 10;
				number1 = number1 / 10;
					if (rounding >= 5 && number > 0) {
						number1++;
					}
					else if(rounding <= -5 && number1 <0) {
						number1--;
					}
					resultant= number1 / 100.0;
					double root2 = (-b - first) / (2*a);
					double resultant2 = 0.0;
					int integer = (int) (root2 * 1000);
					int number2 = integer % 10;
					integer = integer / 10;
					if (number2 >= 5 && integer > 0) {
						integer++;
					}
					else if(number2 <= -5 && integer <0) {
						integer--;
					}
					resultant2= integer / 100.0;
				if (resultant < resultant2) {
					roots = resultant + " " + resultant2;
					}
				if (resultant2 < resultant){
					roots = resultant2 + " " + resultant;
					}
			}
		s+= "x-intercepts: "  + roots;
		s+=  "\n";
		s+="y-intercept: " + c;
		s+= "\n";
		s+= "Do you want to keep going? <Type \"quit\" to end>";
			//if (userInput.charAt(0); = q){
			//	done = true;
			//} else {
				
			//}
		return s;
		}
}

