import java.util.Scanner;
public class VolCon{
public static void main(String[] args) {
   System.out.println("Enter the Alphabet : ");
   Scanner s = new Scanner(System.in);
   char al;
   al = s.next().charAt(0);
   if (al == 'a' || al == 'e' || al == 'i' || al == 'o' || al == 'u' || al == 'A'|| al == 'E' || al == 'I' || al == 'O' || al == 'U') {
          System.out.println("it is a vowel");
   }
   else
          System.out.println("it is a consonent");
}
}
   
