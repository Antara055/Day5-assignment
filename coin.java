import java.util.Random;
import java.util.Scanner;
class coin {
     public static void main(String[] args) {
      System.out.println("*********Flip the coin*********");

      int head = 0;
      int tail = 0;
      System.out.println("how many time you want to flip");
      Scanner s = new Scanner(System.in);
      int time = s.nextInt();
      for(int i=0; i<time; i++)
      {
        Random random = new Random();
        double coin = random.nextInt(2);
        if (coin < 0.5) {
           System.out.println("it is tail");
           tail = tail++;
           System.out.println("no of tail : " +tail);
           }
       else {
           System.out.println("it is head");
           head = head++;
            System.out.println("no of head : " +head);
           }
      }
     float per_tail =((tail / time) * 100);
     float per_head =((head / time) * 100);
 System.out.println("percentage of tail : " +per_tail);
 System.out.println("percentage of head : " +per_head);
 }
}
