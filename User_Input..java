import java.util.Scanner; 
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

	// Helper method to parse to an int with a try-catch
	public static int getIntegerNumber(String arg)
	{
		try
		{
			return Integer.parseInt(arg);
		}catch(NumberFormatException e)
		{
			System.out.println("ERROR: " + e.getMessage() + " This argument must be an integer!");
		}
    	        //error, return 1
		return 1;
	}
	
	public static double getDoubleNumber(String arg) {
		
		return -1; 
	}
	
}
