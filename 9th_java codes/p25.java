
//to find the sum of the natural numbers upto the limit guven by the yser
import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the limit upto which u wanna find the sum.");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
