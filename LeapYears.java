public class LeapYears {

	public static void main(String[] args) {

		int year1 = 2016; // leap year
		int year2 = 1700; // not a leap year
		int year3 = 1600; // leap year
		int year4 = 2015; // not a leap year
		
		isLeap(year1); 
		isLeap(year2);
		isLeap(year3);
		isLeap(year4);
		
	}


	public static boolean isLeap(int year) { 
		
		boolean centuryYear = false; 
		
		if(year % 100 == 0) { // checks whether the year is a century year
			centuryYear = true; 
			System.out.println("The year " + year + " is a century year");
			
			if( year % 400 ==0 ) { // checks if the century year is a leap year 
				System.out.println("The century year " + year +  " is also a leap year! ");
				return true; 
			}else { 
				System.out.println("The year " + year + " is a not leap year");
				return false;
			}
		}else if( year % 4 == 0) { // checks whether the given year is a leap year 
			System.out.println("The year " + year + " is a leap year! ");
			return true;
		}
		else {
			System.out.println("The year " + year + " is not a leap year! ");
			return false; 
		}
		
	}

}
