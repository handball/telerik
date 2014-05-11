import java.util.Scanner;


public class Problem_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int firstNumber = input.nextInt();
int secretCode = input.nextInt();
int secoundNumber = input.nextInt();
int result = 0;
if (secretCode == 4) {
	result = firstNumber + secoundNumber;
}
else if (secretCode==2) {
	result = firstNumber % secoundNumber;
}
else if (secretCode == 8) {
	result = firstNumber * secoundNumber;
}
int output = 0;
if (result%4==0) {
	output = result / 4;
}
else if (result%4!=0) {
	output = result%4;
}
System.out.println(output);
System.out.println(result);
	}
	

}
