package logipro3;
import java.util.Scanner;
public class Logipro3 {

	public static void main(String[] args) {		
		double fahrenheit = (0);
		double celsius = (0);	
				
		Scanner input = new Scanner(System.in);

		       System.out.print("Insira o Fahrenheit: ");
		       fahrenheit = input.nextDouble();
		       		       
		       celsius = (fahrenheit  -32) /1.8;     
		       System.out.println(fahrenheit + " após convertido: " + celsius + " em Celsius");
		        
		        
		        System.out.print("Insira o celsius: ");
		        celsius = input.nextDouble();

		        fahrenheit = celsius *1.8 + 32 ;
		        System.out.println(celsius + " após convertido: " + fahrenheit + " em Fahrenheit:");
		    }
		}


	


