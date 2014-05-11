import java.util.Scanner;

public class NightmareOnCodeStreet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String strB = input.next();
		int count = 0;
		int result = 0;
		for (int i = 0; i < strB.length(); i++) {
			if (i % 2 == 1) {
				char chartemp = strB.charAt(i);
				String string = "" + chartemp;
				int temp = Integer.parseInt(string);
				result += temp;
				count++;
			}

		}
		System.out.print(count + " ");
		System.out.print(result);
	}

}
