package part019;

import java.util.ArrayList;
import java.util.Arrays;

/**

 * This implementation accounts for an arbitrary element E. 
 * This implementation accounts for basic methods plus other methods.
 * This implementation may present NullPointerException for pop if stack is empty. 
 * 
 * @author jairp
 *
 */
public class Stack<E> {
	
	//***attributes***
	
	private final int capacity; // maximum number of elements in the stack
	private E top; // element on top (it will always be at index size-1; 
	private int size; 
	private ArrayList<E> stackArr; // the items inside the stack
	private String name; // maybe you want to name you arrays
	
	//***constructors***
	
	// instantiate with some initial size ( max size ) 
	public Stack(int capacity) { 
		
		this.name = " " + (char) (Math.random()*(200) ); 
		this.capacity = capacity; // this will be the maximum number of elements
		this.size = 0; 
		stackArr = new ArrayList<E>(); // initialize with zero elements		
			
	}
	
	// instantiate with some initial size ( max size ) and a name
	public Stack(int capacity, String name) { 
		
		this.name = name; 
		this.capacity = capacity; // this will be the maximum number of elements
		this.size = 0; 
		stackArr = new ArrayList<E>(); // initialize with zero elements		
			
	}
	
	
	
	//***getters and setters***
	
	
	public int size(){ 
		return this.size; 
	}
	
	public int getCapacity() { 
		return this.capacity; 
	}
	
	public String getName() { 
		return this.name; 
	}
	
	/**
	 * Returns the item at the top of the stack
	 * @return
	 */
	public E top() { 
		
		if(this.top !=  null) { 
			return this.top; 
		}
		
		return null; 
	}
	
	//***Stack methods***
	
	/**
	 * Places an element on top of the stack. Throws an {@code StackOverflowError } if 
	 * the maximum capacity has been exceeded. 
	 * @param e The element to be pushed. 
	 * 
	 * @throws StackOverflowError
	 */
	public void push(E e) { 
		
		if(this.size  > capacity) { 
			throw new StackOverflowError("StackOverflowError: Maximum capacity exceeded"); 
		} else if(e == null) { 
			System.out.println("NULL: No element was added");			
		} else { 
			
			this.stackArr.add(e); 
			this.size++; 
			this.top = e; // get the element that you just added
			
		}
		
	}	
	
	/**
	 * Pops the element on top of the stack and returns it
	 * @return popped Popped element
	 * @throws NullPointerException
	 */
	public E pop() {
		
		if(this.size == 0) { 
			throw new NullPointerException("Can't pop out of an empty array"); 
		} 
		
		E removed = this.stackArr.get(size - 1); // get last element 
		this.stackArr.remove(size - 1); // remove last element
		size--; 
		
		return removed; 
	}
	
	/**
	 * Determines whether the stack is empty. 
	 * @return
	 */
	public boolean isEmpty() { 
		
		if(this.size == 0) { 
			return true; 
		}
		return false; 
		
	}
	
	/**
	 * Determines whether the stack is full
	 * @return
	 */
	public boolean isFull() { 
		
		return this.stackArr.size() == capacity; 
		
	}
	
	/**
	 * Empties the stack
	 */
	public void empty() { 
		
		this.stackArr = new ArrayList<E>(); 
		this.size = 0; 
		this.top = null; 
		
	}
	
	/**
	 * Displays the current stack
	 */
	public void display() { 
		
		if(this.stackArr.isEmpty()) { 
			System.out.println("-----");
			System.out.println(name + "\n");
		} else { 
			
			// loop through all the elements and print them
			for(int i = this.size - 1; i >=  0; i--) { 
				
				// display format
				System.out.print("| ");
				System.out.print(this.stackArr.get(i).toString());
				System.out.println(" |");
				
			}
 			System.out.println("-----");		
			System.out.println(name + "\n");
		}
	}
	
	//*** static methods***
	
	// this one here will display three stacks
	public static void display(Stack<Integer> s1, Stack<Integer> s2, Stack<Integer> s3, int extra) { 
		
//		Stack<Integer> A = new Stack<Integer>(0); 
//		Stack<Integer> B = new Stack<Integer>(0); 
//		Stack<Integer> C = new Stack<Integer>(0); 
		
		Stack<Integer> A = s1; 
		Stack<Integer> B = s2; 
		Stack<Integer> C = s3; 
		
		// get the biggest size for display purposes
		int maxSize = getMax(s1.size(),s2.size(),s3.size()); 

		// iterate in reverse 
		for(int i = maxSize + extra  ; i >= 0; i--)  {
			
			String line = ""; 
			
			if(A.isEmpty()) { 
				line += "       "; // 5 + 2 = 7 spaces to make up for space
			} else { 
				
				// if iteration is bigger than the size, just print an space
				if( i > A.size() - 1 ) { 
					line += "       "; // 5 + 2 = 7 spaces
				} else { 
					
					// append the element to line with formating
					line += "| "; 
					line += A.stackArr.get(i);
					line += " |  "; // 2 + 1 + 4 = 7 spaces
					
				}
				
			}
			
			if(B.isEmpty()) { 
				line += "       "; // 5 + 2 = 7 spaces to make up for space
			} else { 
				
				// if iteration is bigger than the size, just print an space
				if( i > B.size() - 1 ) { 
					line += "       "; // 5 + 2 = 7 spaces
				} else { 
					
					// append the element to line with formating
					line += "| "; 
					line += B.stackArr.get(i);
					line += " |  "; // 2 + 1 + 4 = 7 spaces
					
				}
				
			}
			
			if(C.isEmpty()) { 
				line += "       "; // 5 + 2 = 7 spaces to make up for space
			} else { 
				
				// if iteration is bigger than the size, just print an space
				if( i > C.size() - 1 ) { 
					line += "       "; // 5 + 2 = 7 spaces
				} else { 
					
					// append the element to line with formating
					line += "| "; 
					line += C.stackArr.get(i);
					line += " |  "; // 2 + 1 + 4 = 7 spaces
					
				}
				
			}
			
			if(isStringBlank(line)) { 
				continue; 
			}
			
			System.out.println(line);
			
		}
		
		System.out.println("-----  -----  -----");
		System.out.println("  "  + s1.name + "      "  + s2.name + "      "  + s3.name  );
		System.out.println();
		
		
		// names will go at the end
		

		
	}
	
	/**
	 * Displays the top element of the stack
	 */
	public void peek() { 
		
		System.out.println("Top of the stack: "  + this.stackArr.get(size).toString() ); 
		
	}
	
	//***helper methods***
	
	/**
	 * Returns the biggest of three integers
	 * @param a
	 * @param b
	 * @param c
	 * @return max{a,b,c}
	 */
	private static int getMax(int a, int b, int c) { 
		
		if(a < b && a < c) { 
			return c; 
		} 
		else if( a < c && c < b) { 
			return b; 
		}
		else { 
			return a; 
		}
		
	}
	
	private static  boolean isStringBlank(String s) { 
		
		for(int i=0; i < s.length(); i++) { 
			
			if(s.charAt(i) != ' ') { 
				return false; 
			}
			
		}
		
		return true; 
		
		
	}
	
	/**
	 * Prints a line with n spaces
	 * @param n
	 */
	private static void printLine(int n) {
		
		String s = ""; 
		for(int i=0; i < n; i++) { 
			s+= " "; 
		}
		System.out.print(s);
		
	}
	
	
	
	//***main***
	public static void main(String[] args) {
		
		// will mainly be used for tests
		
		Stack<Integer> myStack = new Stack<Integer>(5, "A"); // initialize Stack with size 5  
		System.out.println(myStack.isEmpty());

		myStack.push(5); 
		myStack.push(4);
		myStack.push(3);
		
		System.out.println(myStack.capacity);
		System.out.println(myStack.size);
		
		myStack.display();
		
		myStack.pop(); 
		myStack.display(); 
		
		System.out.println("Top: " + myStack.top());
		System.out.println(myStack.isEmpty());
		
		Stack<Integer> myStack2 = new Stack<Integer>(5,"B"); // initialize Stack with size 5  
		Stack<Integer> myStack3 = new Stack<Integer>(5,"C"); // initialize Stack with size 5  
		
		myStack2.push(5); 
		myStack2.push(4);
		myStack2.push(3);
		
		myStack3.push(5); 
		myStack3.push(4);
		myStack3.push(3);
		
		display(myStack,myStack2,myStack3,3); 
		
		myStack3.push(myStack2.pop());
		myStack3.push(myStack2.pop());
		
		display(myStack,myStack2,myStack3,3); 
		
		myStack3.push(myStack2.pop());
		
		display(myStack,myStack2,myStack3,3); 
		
		myStack3.display();
		
		myStack3.empty();
		
		myStack3.display();

		
	}

	
}







