
//to find the factors of a number
import java.util.Scanner;

public class p22_factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMEBR TO FIND ITS FACTORS ");
        int n = in.nextInt();
        System.out.print(" FACTORS ARE ");
        int x = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                x++;
                System.out.print(i + " ");
            } else
                continue;
        }
    }
}