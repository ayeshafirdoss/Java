import java.util.Scanner;
public class TimeConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in minutes");
		int m1 = scan.nextInt();
		System.out.println(convertToHours(m1));

	}
	public static double convertToHours(int minutes)
	{
		double h1 = minutes/60;
		return h1;
	}
}
