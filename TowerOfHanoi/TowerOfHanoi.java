package part019;

import java.util.ArrayList;

/**
 * This is a Tower of Hanoi implementation based on the Stack data structure. 
 * The sizes of the disks are represented by positive integers.
 * This is an automatic Tower of Hanoi. 
 * 
 * @author jairp
 *
 */
public class TowerOfHanoi {
	
	//***attributes***
	
	private int N; // number of disks of the tower of Hanoi
	private Stack<Integer> start = new Stack<Integer>(1000, "A"); 
	private Stack<Integer> aux  = new Stack<Integer>(1000, "B"); 
	private Stack<Integer> end = new Stack<Integer>(1000,"C"); 
	
	private int extra = 0; 
	private int i = 1; // counts the number of iterations
	
	//***constructors***
	
	public TowerOfHanoi(int N) { 
		
		if(N > 9) { 
			System.out.println("Sorry, can't calculate more than 9 disks");
			N = 9; 
		}
		
		extra = N - N/5 ; // adjusts the display
		this.N= N; // set the number of disks
		for(int i=N; i >= 1; i--) { 
			
			start.push(i); //  fill the start tower with the number of disks
			
		}
		
		
	}
	
	//***methods***
	
	//Tower of Hanoi
	// The tower of Hanoi is defined recursively 
	public void T(int N, Stack<Integer> start, 
					 	 Stack<Integer> aux, 
					 	 Stack<Integer> end) { 		
		
		if(N > 9) { 
			System.out.println("Sorry, can't only calculate up to 9 disks");
			N = 9; 
		}
		
		if(N < 1) {
			System.out.println("No move was executed"); 
		} 
		else if(N == 1) { // base case
			transfer(start,end); // simply transfer the element
			System.out.println("ITERATION: " + i);
			Stack.display(start,aux,end,extra);
			
			i++; 
		}
		else { 

			/*
			 * The following algorithm is defined recursively as follows: 
			 * 
			 * Step 1: Move top N-1 disks from start to aux
			 * Step 2: Move 1 disk from start to end
			 * Step 3: Move N-1 disks from aux to end
			 * 
			 */
			T(N-1,start,end,aux); 
			T(1,start,aux,end); 
			T(N-1,aux,start,end); 
						
		}
		
				
	}
	
	public void runTower() { 
		
		Stack.display(start, aux, end,extra);
		this.T(N, start, aux, end);

		System.out.println("COMPLETE");
		
	}

	
	//*** helper methods***
	
	/**
	 * Transfers the top of Stack A to B
	 * @param A
	 * @param B
	 */
	private static void transfer(Stack<Integer> A, Stack<Integer> B) { 
		
		B.push(A.pop());
		
	}
		
	
	public static void main(String[] args) {
		
		// Build a new tower of Hanoi 
		TowerOfHanoi toh = new TowerOfHanoi(3); 
		
		// Run animation of the tower 
		toh.runTower(); 
	

	}

}
