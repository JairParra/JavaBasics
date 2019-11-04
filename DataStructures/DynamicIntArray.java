
import java.util.Arrays;

// a dynamic array object
public class DynamicIntArray {

	
	private int[] arr; 
	private int size; // number of elements in the array (not equal to length) 
	
	//***setters and getters***
	
	public int getSize() { 
		return this.size; 
	}
	
	//***constructors***
	
	// have a guess of the size
	public DynamicIntArray() { 
		this.arr = new int[10]; 
		this.size = 0; 
	}
	
	// initialize with a certain size
	public DynamicIntArray(int size) { 
		this.arr = new int[size]; 
		this.size = 0; 
	}
	
	// intialize with an input array
	public DynamicIntArray(int[] arr) { 
		
		// make a copy of the input array
		int[] copyArr = new int[arr.length]; 
		
		for(int i=0; i < arr.length; i++) { 
			copyArr[i] = arr[i];
		}
		
		this.arr = copyArr; 
		this.size = arr.length; 
		this.resizeArray(); // since new elements will probably be added
		
	}
	
	//
	
	//***toString();***
	public String toString() {  
		
		String s = "["; 
		for(int i=0; i < this.size; i++) { 
			
			 if(i == size -1) { 
				 s+= arr[i]; 
			 } else { 
				s += arr[i] + ", "; 
			 }
			 
		}
		return s + "]"; 
		
	}
	
	//***methods***
	
	// if space need to be added
	private void resizeArray() { 
		
		int[] newArr =  new int[arr.length*2]; 
		for(int i=0; i < arr.length; i++) { 
			newArr[i] = arr[i]; 
		}
		this.arr = newArr; 
		
	}
	
	// Index Methods
	
	// appends the element to the end of the array
	public void add(int x) { 
		
		if(this.size >= this.arr.length) { 
			resizeArray(); 
		}
		arr[this.size] = x; 
		this.size++; 
		
	}
	
	public void addAtIndex(int x, int index) { 
		
		if(this.size >=  arr.length) { 
			resizeArray(); 
		}
		
		shiftRight(index); 
		arr[index] = x ; 
		
		this.size++; 
			
	}
	
	// shift the elements over, starting at the end
	// no IndexOutOfBounds exception since size and length are different
	private void shiftRight(int index) { 
		
		for(int i = this.arr.length -1; i > index;  i--) { 
			arr[i] = arr[i-1]; 			
		}
		
	}
	
	private void shiftLeft(int index) { 
		
		for(int i = index; i < this.arr.length - 1; i++) { 
			arr[i] = arr[i+1]; 
		}
	}
	
	public int getAtIndex(int index) { 
		
		if( index >= this.size ) { 
			throw new IllegalArgumentException("Invalid index"); 
		}
		
		return this.arr[index]; 
	}
	
	public void replaceAtIndex(int x, int index) { 
		
		if(index  >=  this.size) { 
			throw new IllegalArgumentException("Invalid index"); 
		} 
		
		this.arr[index] = x ; 
		
	}
	
	public int removeAtIndex(int index) { 
		
		int x = arr[index]; 
		
		shiftLeft(index); 
		
		this.size-- ;
		
		return x; 
		
	}
	
	// checks if the DyamicIntArray contains the element x
	public boolean contains(int x) { 
		
		for(int i=0; i < this.size; i++) { 
			
			if (this.arr[i] == x ) {
				return true; 
			}
			
		}
		return false; 
		
	}
	
	// returns the first index of x
	public int firstIndexOf(int x) { 
		
		for(int i=0; i < this.size; i++) { 
			
			if(this.arr[i] == x) { 
				return i ; 
			}
			
		}
		
		System.out.println("Element was not found. Integer.MIN_VALUE will be returned");
		return Integer.MIN_VALUE; 
		
	}
	
	// returns the last index of x
	public int lastIndexOf(int x) { 
		
		for(int i = this.size; i > 0; i--) { 
			
			if(this.arr[i] == x) { 
				return i; 
			}
			
		}
		
		System.out.println("Element was not found. Integer.MAX_VALUE will be returned");
		return Integer.MAX_VALUE; 
	}
	
	// replaces all instances of x with y
	public void replaceAll(int x, int y) { 
		
		for(int i=0; i < this.size; i++) { 
			
			if(this.arr[i] == x) { 
				this.arr[i] = y ; 
			}
			
		}
		
	}
	
	// removes the first occurrence of the element
	public void removeElement(int x) { 
		
		for(int i=0; i < this.size ; i++) { 
			
			if(this.arr[i] == x) { 
				
				shiftLeft(i); 
				this.size--; 
				break; 
				
			}
			
		}
		
	}
	
	// removes all occurrences of the element
	public void removeAllElement(int x) { 
		
		for(int i=0; i < this.size ; i++) { 
			
			if(this.arr[i] == x) { 
				
				shiftLeft(i); 
				this.size--; 
				
			}
			
		}
		
	}
	
	public void reverse() {
		
		// go until half of the size and swap the elements 
		for(int i=0; i < this.size / 2; i++) { 
			
			swap(this.arr, i , this.size - 1 - i); 
			
		}
		
	}
	
	// swaps two elements in the array 
	public void swap(int[] arr, int a, int b) { 
		
		int temp = arr[a]; 
		arr[a] = arr[b]; 
		arr[b] = temp; 
		
	}
	
	
	// appending a DynamicIntArray
	
	public void add(DynamicIntArray other) { 
		
		int newSize = this.size + other.size; 
		int newArray[] = new int[newSize]; 
		
		// copy these elements into the new array
		copyInto(this.arr, this.size, newArray, 0) ; 
		// copy the other elements into the new array
		copyInto(other.arr, other.size, newArray, this.size); 
		
		// set the new size and array
		this.size = newSize; 
		this.arr = newArray; 
		
	}
	
	public static void copyInto(int[] fromArr, int size, int[] toArr, int start) { 
		
		// copy size from the fromArr into the toArr
		// starting at position start
		for(int i=0; i < size; i++)  {
			toArr[start + i] = fromArr[i] ; 
		}
		
	}
	
	
	public static void main(String[] args) {
		
		// test
		DynamicIntArray dArr = new DynamicIntArray(30); 
		System.out.println(dArr);
		
		for(int i=0; i < dArr.arr.length; i++) { 
			
			int ranNum = (int) (Math.random()*100 + 1); 
			dArr.addAtIndex(ranNum, i);
			
		}
		
		System.out.println(dArr);
		System.out.println("dArr elements: " + dArr.getSize());
		
		DynamicIntArray dArr2 = new DynamicIntArray(10); 
		System.out.println(dArr2.arr.length);
		
		for(int i=0; i < dArr2.arr.length ; i++) { 
			
			dArr2.add(i);
			
		}
		
		System.out.println(dArr2);
		dArr2.reverse();
		System.out.println(dArr2);
		
		
	}

}
