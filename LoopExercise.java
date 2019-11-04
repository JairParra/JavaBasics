public class LoopExercise {

	public static void main(String[] args) {

		multPrint(3,20); 
//		
//		multPrint(50,2); 
//		
//		multPrint(10,99);
		
		stChar("papaya"); 
		
		System.out.println(over21(18,23)); // calls method that prints between 18 and 23 
//		System.out.println(over21(21,21));
//		System.out.println(over21(21,17));
//		System.out.println(over21(16,21));
//		System.out.println(over21(2678,23789));
		
//		printaL(); 
		
		printDivisors(36); 
		System.out.println();  // printDivisors test
		printDivisors(72); 
		System.out.println();
		printDivisors2(29); 
		printDivisors(69);
		System.out.println();
		
		
		randLoop(0,100); 
		blastOff(); 
		
		System.out.println();
		
		sumNum();
		
		System.out.println();
		
		drawLine(20); 
		drawLine2(); //
		drawLineH(); 
		drawArrowLine(); 
		drawEmptyBox();
		
		System.out.println();
		
		drawFilledBox(10,10,'&'); 
		
		System.out.println();
		
		drawLowerLeftTriangle(5,5,'X'); 
		drawUpperLeftTriangle(5,5,'@'); 
		printLowerRightTriangle(5,5,'P');
		printUpperRightTriangle(5,5,'M');
		
		
		drawNumberSign(5,5,'#');
		
		System.out.println();
		
		isPrime(3);
		isPrime(7);
		isPrime(29);
		isPrime(4);
		isPrime(9);
		isPrime(21);
		
		//  
		
		findPrimes(21); 
		
		
		
	}
	
	
	/*
	 *        y
	 *        |
	 * 	x ->	0 1 2 3 4 
	 *    	  0   #   #
	 *        1 # # # # #
	 *        2   #   #
	 *        3 # # # # #
	 *        4   #   #
	 * 	
	 */
	public static void drawNumberSign(int length, int height, char c) { 
		
		for ( int y=0; y < height; y++) { // vertical 
			
			for(int x=0; x < length; x++) { // horizontal 
				
				// pick the values of y and x
				// that should produce a symbol
				
				if(y==1 || y == 3 || x == 1 || x ==3) { // this represents a coordinate system
					System.out.print(c);
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println("");
			
		}
		
	}
	
	
	
	// loop to draw a triangle shape
	public static void drawLowerLeftTriangle(int length, int height, char c) { 
	
		for(int y=0; y < height; y++) { // height, vertical drawing  
			
			// make the inner loop depend on y
			// note the condition 'x < y + 1 '
			for(int x=0; x < y + 1; x++) { 
				System.out.print(c);
			}
			System.out.println();
			
		}
		
		
	}


	
	//  taken from the internet. Understand the code!!!
	public static void printLowerRightTriangle(int length, int height, char c){
	    
		for(int y=1; y <= height; y++){ // external for loop, vertical
	    	
	        for(int space = height; space > y; space--) { // space whenever space is more than 
	        	System.out.print(" ");
	        }
	            
	        for(int x=1; x <= y; x++) {
	        	 System.out.print(c);
	        }
	        
	        System.out.println();
	    }
		
	}
	
	
	public static void printUpperRightTriangle(int length, int height, char c) { 

        for(int y = 0; y <= height -1; y++ ) { // the -1 is important here! (count from 0)
          
        	for( int x = 0; x <= length -1 ; x++ ){ // and here ! 

        		if(y <= x) {
        			System.out.print(c);
        		}
               
        		else {
        			System.out.print(" ");
        		}
 
           }
           System.out.println();
       }
	}
	
	
	public static void drawUpperLeftTriangle(int length, int height, char c) { 
		
		
		for(int y = height; y > 0; y--) { // external cycle inverted
			
			for(int x=0; x < y ; x++) { 
				System.out.print(c);
			}
			System.out.println();
			
			
		}
		
	}
	
	// loop for printing a filled box
	public static void drawFilledBox(int length, int height, char c) { 
		
		
		// start from the vertical side
		for(int j=0; j < height; j++) {  // y axis
			
			for(int i= 0; i <length; i++) { // x axis
				System.out.print(c); // prints the selected char
			}
			System.out.println();
		}
		
		
	}
	

	
	
	// method to draw a line jumping space with some char parameter
	public static void drawLineJumpSpace(int length, char c) { 
		
		
		for(int i=1; i<length; i++) { 
			
			if( i%2 == 0) { 
				System.out.println(0); // print char skipping space
			}
			else { 
				System.out.println(" ");
			}
			
			
		}
		
		
	}
	
	// draw and empty box
	// put all the methods together
	public static void drawEmptyBox() { 
		
		int length = 5; 
		
		for(int i=0; i < length ; i++ ) { 
			
			if(i==0 || i == length -1) { 
				drawLine	(5); 
			}else {
				drawEdges(5); 
			}
			
			
		}
		System.out.println();
		
		
	}
	
	
	// method to draw the edges
	public static void drawEdges(int size) { 
		
		// iterate size times
		for (int i=0; i<size; i++) { 
			
			// if it's the first or last iteration ,  print a star
			if( i== 0 || i == size -1) { 
				System.out.print("*");
			}
			else{ // otherwise print a space
				System.out.print(" ");
			}
			
			
		}
		
		System.out.println(""); // what is this here for
		
	}
	
	
	
	// draw a line that starts and ends with an arrow
	public static void drawArrowLine() { 
		
		int linelenght = 20; 
		for(int i=0; i < linelenght; i++) { 
			
			if(i==0) {  //  first iteration
				System.out.print("<");
			}
			else if ( i ==  linelenght - 1) { // last iteration
				System.out.print(">");
			}
			else { 
				System.out.print("-");
			}
			
		}
		System.out.println("");
		
	}
	
	// line that alternates hyphens and spaces
	public static void drawLineH() { 
		
		int lineLenght = 20; 
		for( int i=1; i < lineLenght; i++) { 
			if (i%2 == 0) {  					// the modulo 2 prints hyphens evenly 
				System.out.print("-"); 
			}else { 
				System.out.print(" ");
			}
		}
		
		System.out.println();
		
	}
	
	
	
	// draw a line with length and char parameter
	public static void drawLine(int x, char c) { 
		
		for(int i=0; i < x; i++) { 
			System.out.print(c);
		}
		System.out.println("");
	}

	
	
	//  draw a line with lenght parameter
	public static void drawLine(int x) { 
		
		
//		 System.out.println("**********");  //with no for loop 
		
		int numStars = x; // determines customizable lenght limit
		
		for(int i = 0; i < numStars; i++) { 
			System.out.print("*");
		}
		
		System.out.println();
		
	}
	
	
	// has random length
	public static void drawLine2() {
		
		// number from 0 to 1
		double randNum = Math.random(); 
		
		double numStars = randNum * 20; 
		
		for(int i=0; i <numStars; i++) { 
			System.out.print("*");
		}
		
		System.out.println();
		
	}


	
	// print the sum of all numbers from 0 to 100
	public static void sumNum() {
		
		int sum = 0 ;
		for (int r=0; r <= 100; r++) { 
			sum = sum + r; 
		}
		System.out.println("The sum from 0 to 100: " + sum );

	}
	
	
	// method that prints random numbers until 0 is generated
	// it also counts how many numbers were printed
	public static void randLoop(int lower, int upper) { 
		
		System.out.println(" ");
		
		int x = lower; // lower limit (inclusive)
		int y = upper; // upper limit 
		int counter = 0; 
		
		int rand = (int) (Math.random()*((y-x)+1) + x); 
		
		
		System.out.println("Random numbers: ");
		while (rand > 0) { // when the number is 0, the loop stops
			System.out.print(rand + ", ");
			rand = (int) (Math.random()*((y-x)+1) + x); 
			counter ++; 
		}
		
		
		System.out.println("Done");
		System.out.println("There were " + counter + " random numbers!");
		
	}
	
	// could add a parameter here
	public static void blastOff() { 
		
		for(int i=15; i >= 0; i--) { 
			
			//print something different for i=0
			if (i == 0 ) { 
				System.out.println("Blastoff!");
			}else { 
				System.out.println(i + " ");
			}
		}
		
		System.out.println();
		
		// print all powers of 2 below 2000
		for (int i=1; i < 2000  ; i *= 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	
	// iterating
	// prints all evens between 0 and 100
	public static void iterating() { 
		
		int j = 0;
		
		while (j < 100) { 
			
			// perform a test ( Pair numbers? )
			if(j%2 == 0) { 
				System.out.println("J: " + j);
			}
			
			j++; 
			
		}
		
	}
	
	
	// method that takes an integer and prints all its divisors
	public static void printDivisors(int x) { 
		
		int mod = 2; // initializes the counter
		int divisor = 2; // initialize divisor
		
		while (mod < x) { 
			
			if( x / divisor == 1 || x / divisor == x) { // checks that the number is not 1 or itself
				continue;
			}
			if ( x % mod == 0 ) { // mod = 0 means the number is divisible
				
				divisor = mod; // divisor now takes the successful mod to be printed
				System.out.print(divisor + ", ");	
				
			}
	
			mod ++ ; 
		}
		
	}
	
	// same as above but with a for loop 
	public static void printDivisors2(int x) { 
		
		int count = 0;  
		int divisor = 2; 
		
		for(int i=2; i<x; i++) { // i represents the mod
			
			if(count == 0 ) { 
				System.out.println("No divisors found. Is this a prime? ");
				break; 
			}
			else if( x / divisor == 1 || x / divisor == x) {
				continue; 
			}
			else if (x % i == 0) { 
				
				divisor = i; 
				System.out.print(divisor + ", ");
				count ++; 
				
			}
			
			
		}
	}
	
	
	
	// method that prints all the uppercase letters of the alphabet
	public static void printaL() {
		
		int i = 65; // initialize counter at uppercase A ASCII value
		
		char temp = '&'; //  initialize temp to store any random char so it can be printed later
		
		while ( i < 91) { // 90 is the last uppercase ASCII value
			
			temp  = (char) i ; 
			System.out.println(temp);
			i ++; 
			
		}
		
	}
	
	
	// closest to 21 between x and y
	public static int over21(int x, int y) { 
		
		int limit = 21; 
		
		if ( x <=  limit && x > y) { 
			return x; 
		} 
		else if ( y <= limit && y > x) { 
			return y; 
		} 
		else if ( x ==  limit && y == limit ) { 
			return x; // case by default if both are equal
		}
		else if ( x > limit && y <= limit) { 
			return y; 
		}
		else if ( y > limit && x <= limit) { 
			return x; 
		}
		else { 
			return 0; 
		}
		
		
	}
	
	public static void stChar(String s) {
		
		int i = 0; // initialize counter
		
		while( i < s.length()) { 
			
			System.out.println(s.charAt(i));
			i ++ ;
			
		}
		
		
	}
	
	// taken from the internet :( 
	public static boolean isPrime(int n) { 
		
		
		boolean prime = true; // assume true by default
		
		int sqrt = (int) Math.sqrt(n) + 1; // need to get the square of the number
	
		for(int i = 2; i < sqrt; i++) { 
			if(n % i == 0) { 
				// number is perfectly divisible 
				prime = false; 
				System.out.println("Is " + n + " prime?: " + prime);
				return prime; 
			}
		}		
		
		prime = true; 
		System.out.println("Is " + n + " prime?: " + prime);
		return prime; 
	}
	
	
	// find all the primes up to an integer
	public static void findPrimes(int max) { 
		
		System.out.println();
		for (int i=2; i < max; i++) {
			
			boolean isPrime = isPrime(i); // call the isPrime method
			
			if(isPrime) { 
				System.out.println("Prime number: "  + i );
			}
			
			
		}
		System.out.println();
	}
	
	
	
	// all multiples of x between x and y
	public static void multPrint(int x, int y) { 
		
		int factor = 1; // this will increase 
		int multiple = 0;
		
		if( x < y ) { // the if conditions check which one is higher
			
			multiple = x ; // keeps track of the multiple to be print 
			
			while ( multiple <  y ) { 
				
				multiple = x * factor; // get the multiples so they can be printed
				
				if(multiple > y) { // except when bigger than the second number
					break;
				}
				
				System.out.print(multiple + " ");
				
				
				factor ++; 	
				
			}
			
		} else if ( x == y) {
			System.out.println(" That's the same number!  " + x);
		} else { // case x > y , same code as above

		multiple = y ; // keeps track of the multiple to be print 
				
				while ( multiple <  x ) { 
					
					multiple = y * factor;
					
					if(multiple > x) {
						break;
					}
					
					System.out.print(multiple + " ");
					
					
					factor ++; 	
					
				}
			}
		
	}
	
	// Bentley Binary-to-Decimal converter
	public static int convertBinToDec(String s) { // String is binary
		
		int result  = 0 ;
		int powerOfTwo = 1; 
		
		// iterate from the end of the String to the beginning 
		for( int i = s.length(); i >= 0 ; i --)  { 
			//get a character 
			char c = s.charAt(i); 
			// if the character is a one at this location 
			// add the power to the result 
			
			if( c == '1') { 
				result += powerOfTwo; 
			} else if ( c == '0') { 
				// 0 is okay
			} else { // for any other character, throw and exception
				String errorMessage = "Not a binary #: " + s ; 
				throw new NumberFormatException(errorMessage);  
			}
			
			// increase the power of 2 
			powerOfTwo *= 2 ; 
			
		}
		
		
		return result; 
		
	}
	
	
    // unrelated 
    public static void printNumSign(int size) { 
    	
    	// if the size is pair, increase by one
    	if( size % 2 == 0) { 
    		size ++; 
    	}
    	
    	int medianIndex = (size/2) + 1; 
    	int leftInd = medianIndex - 2;
    	int rightInd = medianIndex + 1; 
    	
    	
    	// track the vertical values 
    	for(int y=0; y < (size+1); y++) { 
    		// track the horizontal coordinates
    		for(int x =0; x < (size+1); x++ ) { 
    			
    			if(y == leftInd || y == rightInd || x == leftInd || x == rightInd) { 
    				System.out.print("#"); 
    			}else { 
    				System.out.print(" ");
    			}
    			
    		}
    		System.out.println();
    	}
    	
    	
    }

}
