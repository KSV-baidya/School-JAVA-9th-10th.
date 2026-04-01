import java.util.Scanner;

public class p27_sumofdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER WHICH YOU FIND THE SUM OF THE DIGITS OF ");
        int n = in.nextInt();
        int sum = 0;
        int original = n;
        while (n != 0) {
            int last = n % 10;
            sum = sum + last;
            n = n / 10;
        }
        System.out.println(" THE SUM OF THE DIGITS OF " + original + " IS " + sum);

    }
}
