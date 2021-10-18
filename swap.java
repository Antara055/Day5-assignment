import java.util.Scanner;
public class swap {
	public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
		System.out.println("enter the first no :");
                int num1 = s.nextInt();
                System.out.println("enter the second no :");

		int num2 = s.nextInt();
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("num1 : "+num1 + "\n" + "num2 : "+num2);
	}

}
