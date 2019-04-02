
/**
 * Elementary implementation of a slighlty customizable dice simulation. 
 * The program includes a random integer generator with custom limits, as well 
 * as a dice simulator which included number of rolls, whether a single die or a pair is rolled, 
 * as well as whether or not to combine the results. 
 * @author Hair Parra
 *
 */
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i =0 ; i < 10; i++) { 
			System.out.println(" Random dice: " +  dice()); //  works!! 
			System.out.println(" Random double dice: " +  doubleDice());
		}
		System.out.println();
		// Test simulation method 
		
		simulateRolls(10, true, true); // roll 10 times two dice and print the pairs

	}
	
	public static int doubleDice() { 
		return randInt(2,12); 
	}
	
	public static int dice() {  
		return randInt(1, 6); 
	}
	
	/**
	 * Simulates a certain number of dice rolls between 1 and 12. 
	 * @param n Number of rolls
	 * @param doubleDice {@code logical}. Roll one or two dice. 
	 * @param split {@code logical}. Output combined result or the pair
	 */
	public static void simulateRolls(int n, boolean doubleDice, boolean split) {
		
		// safety check
		if(n < 1) { 
			System.out.println("Invalid number of rolls. Default will be set to 1 roll");
			n = 1; // default
		}
		else if( n > 12) { 
			System.out.println("Maximum of 12 rolls as an example only");
			n = 12; 
		}
		
		System.out.println("Rolling " + n + " pairs of dice...");
		
		String result = "";  // to output the result at the end
		
		if( !doubleDice ) { // only roll one dice at the time
			
			result += "[" + dice() + ", " ; // first roll
			for(int i=1; i < n; i++) { 
				result += dice() + ", " ; 
			}
			result += dice() + "]"; // last roll
			
		}
		else if( doubleDice && split) { // output the pair 
			
			result += "[(" + dice() + ", " + dice() + ")," ; // first roll
			for(int i=1; i < n; i++) { 
				if( i % 5 == 0) { // output maximum 5 pairs at each line
					result += "\n" ; 
				}
				result += "(" + dice() + "," + dice() + "), " ; 
			}
			result += "(" + dice() + "," + dice() + ")]"; // last roll
			
		}
		else { 
			
			result += "[" + doubleDice() + ", " ; // first roll
			for(int i=1; i < n; i++) { 
				result += doubleDice() + ", " ; 
			}
			result += doubleDice() + "]"; // last roll
			
		}
		
		System.out.println(result);
	}
	
	/**
	 * Returns a random int between low and high (inclusive)
	 * @param low
	 * @param high
	 * @return
	 */
	public static int randInt(int low, int high) { 
		int x = low; 
		int y = high; 		
		return (int)(Math.random()*(y-x+1) + x) ; //  set up the bounds and return 
	}

}
