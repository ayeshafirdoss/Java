import java.util.Scanner;
public class ArithmaticOperations {

	public static void main(String[] args) {
		int r1 = subtractNumbers(20,5);
		int r2 = multiplyNumbers(4,5);
		double r3 = divideNumbers(20,4);
		int r4 = findRemainder(10,3);
		System.out.println(r1);
		System.out.println(r2);
		System.out.printf("%.2f\n",r3);
		System.out.println(r4);
	}
		
			
		public static int subtractNumbers(int num1, int num2)
		{
			return num1-num2;
		}	
		
		public static int multiplyNumbers(int num1, int num2)
		{
			return num1*num2;
		}	
			
		public static double divideNumbers(int num1, int num2)
		{
			return num1/num2;
		}
		
		public static int findRemainder(int num1, int num2)
		{
			return num1%num2;
		}
		
		
		
		
		
		
	}
		
		
		


