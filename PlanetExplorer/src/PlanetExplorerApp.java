import java.util.Scanner;
public class PlanetExplorerApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a double value");
		double d1 = scan.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.printf("%.2f" ,explorer.calculateSurfaceArea(d1));
		
		
	}

}
