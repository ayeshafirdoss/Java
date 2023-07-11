import java.util.Scanner;
public class FinanceCalculatorApp {

	public static void main(String[] args) {
		FinanceCalculator calculator = new FinanceCalculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principal amount");
		double p1 = scan.nextDouble();
		System.out.println("Enter rate");
		double r1 = scan.nextDouble();
		System.out.println("Enter time");
		double t1 = scan.nextDouble();

		System.out.println(calculator.calculateSimpleInterest(p1, r1, t1));

	}

}
