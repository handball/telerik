import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String digits = in.next();
		int count = 0;
		int sum = 0;
		for (int i = 0; i < digits.length(); i++) {
			if (i % 2 == 1) {
				char value = digits.charAt(i);
				String newstring = "" + value;
				int values = Integer.parseInt(newstring);
				sum = sum + values;
				count++;
			}

		}
		System.out.println(count + " ");
		System.out.println(sum);
	}

}
