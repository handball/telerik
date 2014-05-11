import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int result = 0;
		if (B == 2) {
			result = A % C;
		} 
		else if (B == 4) {
			result = A + C;
		} 
		else if (B == 8) {
			result = A * C;
		}

		int output = 0;
		if (result % 4 == 0) {
			output = result / 4;
		} 
		else if (result % 4 != 0) {
			output = result % 4;
		}
		System.out.println(output);
		System.out.println(result);
	}

}
