/**
 * The following program will obtain the input from command arguments. 
 * This is done via the "args" parameter, which will store the input arguments 
 * in form of a String array, which can then subsequently used in the program. 
 * For example, this could be call from command prompt as : 
 * Java ./CalcExample 2 + 3
 * Output: 5
 * @author Hair Parra
 */
public class CalcExample
{
    public static void main(String[] args)
    {
        //get the two ints and the operator
        //from the input arguments
        int a = Integer.parseInt(args[0]);
        String operator = args[1];
        int b = Integer.parseInt(args[2]);
        
        double result = 0;
        
        if (operator.equals("+")){
            result = a + b;
        }
        else if (operator.equals("*")){
            result = a * b;   
        }
        //...Add in other operators here
        
        else {
            //Show error for unknown operators
            System.out.println("Error: " + operator);
        }
        
        System.out.println("Result: " + result);
    }
    
    
}
