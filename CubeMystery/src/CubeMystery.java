import java.util.Scanner;
public class CubeMystery 
 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		System.out.println(cubeNumber(n1));
	}
	
	public static int cubeNumber(int num)
	{
		return num*num*num;
	}
	


}



