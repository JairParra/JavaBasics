# Tower of Hanoi 

## Description 

The tower of Hanoi is defined under the following rules: 
- You have three towers and `n` rings of different sizes. 
- These rings contain unique ordered positive integer weights or sizes.
  - e.g. for `n=4`, you have rings of sizes `1,2,3` and `4`. 
- At any time and any tower, any ring can only be on top of rings whose size are bigger (e.g. `2` can only be on top of `3` and `4`). 
- You can only move one ring at the time. 

Your goal is to move all the rings from the first towers (stack) to the last one following the rules above. 

## Algorithm 

```
TowerOfHanoi(N, start, aux, end) { 
  // Parameters 
  N: Current number of blocks in the start tower 
  start: start tower 
  aux: auxiliary tower
  end: end goal tower 
  
  if (N == 1) { 
    move the block in start to the end tower 
  }
  else {
    	 * The TOH algorithm is defined recursively as follows: 
			 * 
			 * Step 1: Move top N-1 disks from start to aux
			 * Step 2: Move 1 disk from start to end
			 * Step 3: Move N-1 disks from aux to end
  } 
}
```

## Notes

- This is a Java Implementation  
- There is a custom Stack data structure used (not the default Java Stack class) 
- The maximum number of rings supported because of display constraints is 9. 
- You can run the tower as follows: 

```java
// Determine number of rings N such that 1 <= N <= 9 
int N = 3; 

// Build a new tower of Hanoi 
TowerOfHanoi toh = new TowerOfHanoi(N) ; 

// Run animation of the tower 
toh.runTower(); 
```

Running the tower with `N=3` will show the state of all the towers at every step: 
```
| 1 |                
| 2 |                
| 3 |                
-----  -----  -----
  A      B      C

ITERATION: 1
| 2 |                
| 3 |         | 1 |  
-----  -----  -----
  A      B      C
  
ITERATION: 2
| 3 |  | 1 |  | 2 |  
-----  -----  -----
  A      C      B

ITERATION: 3
              | 1 |  
       | 3 |  | 2 |  
-----  -----  -----
  C      A      B

ITERATION: 4
       | 1 |         
       | 2 |  | 3 |  
-----  -----  -----
  A      B      C

ITERATION: 5
| 2 |  | 3 |  | 1 |  
-----  -----  -----
  B      C      A
  
ITERATION: 5
| 2 |  | 3 |  | 1 |  
-----  -----  -----
  B      C      A

ITERATION: 6
              | 2 |  
       | 1 |  | 3 |  
-----  -----  -----
  B      A      C

ITERATION: 7
              | 1 |  
              | 2 |  
              | 3 |  
-----  -----  -----
  A      B      C

COMPLETE
```



