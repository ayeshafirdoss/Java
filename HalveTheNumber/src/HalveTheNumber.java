import java.util.Scanner;
public class HalveTheNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int N1 = scan.nextInt();
		System.out.println(halveTheNumber(N1));
		scan.close();
	}
	public static double halveTheNumber(double num)
	{
		double n1 = num/2;
		return n1;
	}
}
