
public class MathMethods {

	public static void main(String[] args) {
		
		System.out.println("First argument = " + args[0]);
		// create x
		double x = 123; 
		
		// get the square root of x
		// using the Math.sqrt method
		double y = Math.sqrt(x); 
		
		//print out the answer
		System.out.println(y); // 11.090536506409418
		
		double m = 454549; 
		double n = Math.sqrt(x); 
		double z = Math.sqrt(n); 
		
		System.out.println(x + " " + y + " " + z);
		
		double value = Math.pow(2,6); 
		System.out.println(value);

		x = 0.5; 
		double c = Math.cos(x); 
		double s = Math.sin(c); 
		
		System.out.println(s);
		
		s = Math.sin(Math.cos(0.5)); 
		System.out.println(s);

		System.out.println( "3 + 4 is " + addNumbers(3,4));
		
	}
	
	public static int addNumbers(int a, int b) { 
		int result =  a + b ;
		return result; 
	}

}
