
/*
 * @author: Hair Albeiro Parra Barrera
 * @class: Roots
 * @description: 
 * 		this script calculates the real roots of a polynomial of a quadratic polynomial 
 * 		using the quadratic formula.
 */

public class Roots {

	public static void main(String[] args) {
		
	printRoots(1,-3,4);	// no real roots
	printRoots(-4,12,-9); // one real root
	printRoots(2,-11,5); // two real roots

	}
	
	
	// method that finds the roots of a quadratic equation based on the coefficients
	public static void printRoots(double a, double b, double c) { 
		
		
		double x1 = 0; // represents the first root
		double x2 = 0; // represents the second root
	
		try {
			x1 = posRoot(a,b,c);
			x2 = negRoot(a,b,c); 
			
			if( x1 == x2 ) { // checks whether the obtained root is repeated
				
				System.out.println("There is only one root, namely: " + x1 + "\n");
				
			}else if( Double.isNaN(x1) || Double.isNaN(x2) ) { // checks for invalid value
				
				System.out.println("No real roots were found \n");
				
			}else { 
				
				System.out.println("The first root is " + x1);
				System.out.println("The second root is " + x2 + "\n");

			}
				
		}catch( Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	public static double posRoot(double a, double b, double c) {
		
		// the following represents the quadratic root with a positive sign
	
		if(Math.sqrt(Math.pow(b,2) - (4*a*c)) < 0 ) {   // checks for imaginary roots, not evaluated
			
			System.out.println("Determinant less than 0. null will be returned");
			return (Double) null;
			
		}else {
			double root = ((-b) + Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
			
			return root; 	
		}
				
	}
	
	
	public static double negRoot(double a, double b, double c) {
		
		if(Math.sqrt(Math.pow(b,2) - (4*a*c)) < 0 ) { // checks imaginary roots, not evaluated
			
			System.out.println("Determinant less than 0. 0 will be returned");
			return (Double) null;
			
		}else {
			double root = ((-b) - Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
			
			return root; 	
		}
		
	}
	
	
}
