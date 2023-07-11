import java.util.Scanner;
public class PowerSquare {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		System.out.println(squareNumber(n1));
	}
	
	public static int squareNumber(int num)
	{
		return num*num;
	}
	


}
