import java.util.Scanner;

public class QandR {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to be divided: ");

		int dividend =sc.nextInt();
		System.out.println("Enter your divisor value: ");


		int divisor = sc.nextInt();

	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	}

}
