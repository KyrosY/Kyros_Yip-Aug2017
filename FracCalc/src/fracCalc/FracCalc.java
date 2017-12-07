/*Kyros Yip
 * November 20 2017
 * Fraction calculator that adds, subtracts, multiplies, and divides
 */
package fracCalc;
import java.util.*;
public class FracCalc {
    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userInput = new Scanner(System.in);
    	boolean done = false;
    	while(!done) {
    		System.out.println("Enter your input: ");
    		String equation = userInput.nextLine();
    		System.out.println(produceAnswer(equation));
    		System.out.println("keep going?");
    		String s = userInput.next();
    		if (s.charAt(0) == 'q'){
    			done = true;
    		}
    	}
    	userInput.close();
    }
    	
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a frac1tion string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the frac1tion after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) { 
        // TODO: Implement this function to produce the solution to the input
    	String [] split = input.split(" ");
    	String firstNum = split[0];
    	String operator = split[1];
    	String secondNum = split[2];
    	
    	String [] splitNum = splitoperators(firstNum);
    	String [] splitNum2 = splitoperators(secondNum);
    	int [] frac1 = new int[splitNum.length];
   	    int [] frac2 = new int[splitNum.length];
   	   
   	    for(int i = 0; i<frac1.length; i++) {
   		   frac1[i]=Integer.parseInt(splitNum[i]);
   		   frac2[i]=Integer.parseInt(splitNum2[i]);
   	    }
   	    int[] improper = toImproperfrac(frac1[0],frac1[1],frac1[2]);
	    int[] improper2 = toImproperfrac(frac2[0],frac2[1],frac2[2]);
   	    
   	    String end = "";
    	if (operator.equals("+") || operator.equals("-")) {
    			end = (addition(improper,operator, improper2));
    	} else if(operator.equals("*") || operator.equals("/")) {
    			end = (multiplication(improper, operator, improper2));		
    	}
		return end;
    }
    // TODO: Fill in the space below with any helper methods that you think you will need
   public static String[] splitoperators(String operand) {
	   String whole="0";
	   String numerator="0";
	   String denominator="0";
	  
	   if(!operand.contains("/")) {
    		whole=operand;
    		numerator = "0";
    		denominator = "1";
    	} else if(operand.contains("_")) {
    		String [] secondArray = operand.split("/");    	
    		String second = secondArray[0];
    		denominator = secondArray[1];
    		String [] thirdArray = second.split("_");
    		whole = thirdArray[0];
    		numerator=thirdArray[1];
    	} else {
    		whole = "0";
    		if(operand.contains("/")) {
    			String [] fraction = operand.split("/");
    			numerator=fraction[0];
    			denominator=fraction[1];
    		}
    		
    	}
	   String[] answer = { whole, numerator, denominator};
       return answer;
    }
   public static String addition( int[] frac1, String operator, int[] frac2) {
	   int denom = frac1[1];
	   frac1[0]*=frac2[1];
	   frac1[1]*=frac2[1];
	   frac2[0]*=denom;
	   if(operator.equals("-")) {
		   frac2[0] = -frac2[0];
	   }
	   int x  = frac1[0]+frac2[0]; 
	   int y = frac1[1];
	   String result = x + "/" + y;
       //int[] result = {x,y};
	   return result;
	   
   }
   public static String multiplication(int[] frac1, String operator, int[] frac2) {
	   if(operator.equals("/")) {
		   int denom = frac2[0];
		   frac2[0]=frac2[1];
		   frac2[1]=denom;
	   }
	   frac1[0]*=frac2[0];
	   frac1[1]*=frac2[1]; 
	   if (frac1[0] ==0 && frac1[1] ==0) {
		   frac1[0] = -frac1[0];
		   frac1[1] = -frac1[1];
	   }
	   String x = frac1[0] + "/" + frac1[1];
	   
	   //int[] x = {frac1[0], frac1[1]};
	   return x;
	   
   }
   /*
   public static String simplify(int[] frac) {
	   String answer = "";
	   int gcf = gcf(frac[0], frac[1]);
	   int num = frac[0] / gcf;
	   int den = frac[1] / gcf;
	   if(num>0 && den<0) {
		   num=-num;
		   den=-den;
	   }
	   if(num == 0) {
		   answer = "0";
	   } 
	   if(den == 1) {
		   answer = num + "";
	   } 
	   if(num>den || num <0 && num<den) {
		   answer = toMixedNum(num, den);
		   if(answer.charAt(0)=='0') {
			   answer = num + "/" + den;
		   }
	   } else {
		   answer = num + "/" + den;
	   }
	   return answer;
   }
   */
   //Calculate methods
   public static boolean isDivisibleBy(int num, int den) {
		return num % den ==0;
	}
   public static int[] toImproperfrac (int whole, int secondNum, int den) {
	   int improper = 0;
	   if(den>0) {
		improper = (whole * den);
	   } else {
		   improper = whole;
	   }
		if(whole >=0) {
			improper += secondNum;
		} else {
			improper -= secondNum;
		}
		int[] arr = {improper,den};
		return arr;
	}
   public static String toMixedNum (int num, int den) {
		int improper = num/den;
		int remainder = num%den;
		if (remainder<0) {
			remainder = -remainder;
		}
		if (den <0) {
			den = -den;
		}
		return improper + "_" + remainder + "/" + den;
	}
   public static double max(double frac1, double frac2){
		if (frac1 > frac2) {
		return frac1;
		}
		if (frac2 > frac1){
		return frac2;
		}
		return frac2;
	}
   public static int min (int operand1, int operand2){
		if (operand1 < operand2) {
		return operand1;
		}
		if (operand2 < operand1){
		return operand2;}
		return operand2;
	}
   public static boolean isPrime (int operand) {
		int n = 2;
		while (!isDivisibleBy (operand, n)){
			n++;
		} 
		if (n == operand) {
			return true;
		}
		else {
			return false;
		}
	}
   public static int absValue (int operand){
		if (operand >= 0) {
		return operand;
		}
		if (operand < 0){
		return operand + (operand * -2);
		}
		return operand;
	}
   public static int gcf (int operand1, int operand2) {
		int n = (int) min(operand1, operand2);
		operand1=absValue(operand1);
		operand2=absValue(operand2);
		if ( isPrime(operand1) || isPrime(operand2)) {
				return 1;
		} else {
			while (!isDivisibleBy (operand1, n) || (!isDivisibleBy (operand2, n))) {
				n--;
			}
			return n;
		}
   }
}
