import java.util.*;
public class simplecalculator
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Eneter first number : ");
		double number1 = sc.nextDouble();
		
		System.out.println("Enter second number : ");
		double number2 = sc.nextDouble();
		
		System.out.println("Select an operation : (+ , - , * , /)");
		char operation = sc.next().charAt(0);
		
		switch(operation){
		    case '+' : System.out.println("Result : "+(number1 + number2));
		    break;
		    case '-' : System.out.println("Result : "+(number1 - number2));
		    break;
		    case '*' : System.out.println("Result : "+(number1 * number2));
		    break;
		    case '/' : 
		        if(number2 != 0)
		        {
                    System.out.println("Result : "+(number1 / number2));
                }
		        else{
		            System.out.println("Error : divide by 0");
		        }
                break;
                default:System.out.println("Invalid operation");
		        
		        
		}
	}
}
