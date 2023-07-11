import java.util.Scanner;
public class TempConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double f = scan.nextDouble();
		TemoeratureConverter temperatureConverter = new TemoeratureConverter();

		System.out.printf("%.2f" ,temperatureConverter.convertFahrenheitToCelsius(f));

	}

}
