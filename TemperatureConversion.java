public class TemperatureConversion {

	public static void main(String[] args) {
		
		double F = 85.0; // temperature in Farenheit U+00B0
		System.out.println(F + "\u00b0 Farenheit is " + convert(F) + "\u00b0 Celcius " );

	}
	
	public static double convert(double F){ 
		double C = (F-32)*(5.0/9.0) ;
		return C; // C stands for Celcius 
	}

}
