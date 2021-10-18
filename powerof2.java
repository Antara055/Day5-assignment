import java.util.Scanner;
public class powerof2 {
    public static int val = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N>0 && N<=31){
            for (int i=1;i<=N;i++){
                val= val*2;
            }
            System.out.println(val + "its the value");
        }
    }
}
