import java.util.Scanner;

public class p23_factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" ENTER THE NUMBER TO FIND ITS FACTORIAL ");
        int n = in.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        if (n == 0) {
            fact = 1;
        }
        System.out.println(" THE FACTORIAL OF THE NUMBER IS " + fact);

    }
}
