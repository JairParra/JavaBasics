
=import java.util.Scanner; 

/**
 * The following program is a demo of how to obtain user input with Scanner. 
 * @author Hair Albeiro Parra Barrera
 *
 */

public class User_Input {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the adding program! Please input three integers");
		int result = addthree();
		System.out.println(result);
		
		add_n_numbers(10); // add 10 numbers

	}
	
	/**
	 * Asks for input of three numbers and returns the result
	 * @return
	 */
	public static int addthree() {
		int x = 0; 
		int y = 0; 
		int z = 0; 
		
		System.out.println("Please input the first integer");
		Scanner get1 = new Scanner(System.in);
		String s1 = get1.nextLine(); 
		x = getIntegerNumber(s1); 
		
		System.out.println("Please input the first integer");
		Scanner get2 = new Scanner(System.in);
		String s2 = get2.nextLine(); 
		y = getIntegerNumber(s2); 
		
		System.out.println("Please input the first integer");
		Scanner get3 = new Scanner(System.in);
		String s3 = get3.nextLine(); 
		z = getIntegerNumber(s3); 
		
		int result = x + y + z;
		return result; 
	}
	
	/**
	 * Recursively asks for n numbers 
	 * @param n
	 */
	public static void add_n_numbers(double n) { 
		
		double result = 0; 
		double temp = 0; // to temporary store input 
		
		for (int i =0; i < n ; i++) { 
			System.out.println("Please input integer #" + i); 
			Scanner get = new Scanner(System.in); // get from input stream 
			String s = get.next(); // try to scan next int
			System.out.println("Input: " + s); // display input
			temp = getDoubleNumber(s); // attempt to parse to int
			result += temp; 
		}
		
		System.out.println("Sum = " + result); 
	}

	// Helper method to parse to an int with a try-catch
	public static int getIntegerNumber(String arg)
	{
		try
		{
			return Integer.parseInt(arg);
		}catch(NumberFormatException e)
		{
			System.out.println("ERROR: " + e.getMessage() + " This argument must be an integer!");
			System.out.println("Calculation will not be correct: -1 will be added");
		}
    	        //error, return 1
		return -1;
	}
	
	public static double getDoubleNumber(String arg) {
		
		try { 
			return Double.parseDouble(arg); 
		} catch ( NumberFormatException e) { 
			System.out.println("ERROR: " + e.getMessage() + " This argument must be an number!");
			System.out.println("Calculation will not be correct: -1 will be added");
		}
		
		return -1; 
	}
	
}

