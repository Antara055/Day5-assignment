import java.util.Scanner;

public class LargeNo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Enter First Number: ");
		num1 = scanner.nextInt();
		System.out.print("Enter Second Number: ");
		num2 = scanner.nextInt();
		System.out.print("Enter Third Number: ");
		num3 = scanner.nextInt();

		if((num1 > num2) && (num1 > num3)) 
				System.out.println(num1+"is greater");

		else if(( num2 > num1) && (num2 > num3))

				System.out.println(num2+"is greater");

			else
				System.err.println(num3+"is greater");
			
	}
}
