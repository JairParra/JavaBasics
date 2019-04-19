
/**
 * A class equipped with a simple function that prints a line 
 * of the format <-> with for loops. An example of a triangle is given in 
 * the main function. 
 * @author Hair Parra
 */
 
public class Drawing
{
    
    public static void main(String[] args){        
        
        int lineLength = 20;
        // test drive
        printLine(lineLength); // simply print a line 
        
        // print a triangle! 
        for(int i=2; i<20; i++) { 
        	printLine(i);
        }
        // print it backwards!
        for(int i = 19; i >= 2; i--) { 
        	printLine(i);
        }
       
    }
    
    /**
     * Prints a line of the form <->
     * @param n
     */
    public static void printLine(int n) { 
    	if(n <= 1) {
    		System.out.println("<>");
    		return; 
    	}
    	for(int i=0; i < n; i++) { 
    		if(i ==0) { 
    			System.out.print("<"); // beginning of the line
    		}
    		else if(i == n - 1) { 
    			System.out.println(">"); // end of the line
    			return; 
    		}
    		else {  
    			System.out.print("-");
    		}
    	}
    }
    
    /**
     * Generates a random int between {@code lower} and {@code upper} , inclusive. 
     * @param lower
     * @param upper
     * @return
     */
    public static int randomNumber(int lower, int upper) { 
    	
    	int x = lower; // lower bound
    	int y = upper; // upper bound
    	
    	// generates a random int between x and y, inclusive
    	int random = (int) ( Math.random()*(y-x) + x); 
    	
    	return random; 
    }
       
}
