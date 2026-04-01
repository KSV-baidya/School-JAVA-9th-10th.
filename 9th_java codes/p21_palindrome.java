import java.util.Scanner;

public class p21_palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CHECK WHETHER IT IS A PALINDROME NUMEBR ");
        int n = in.nextInt();
        int original = n;
        int r = 0;
        while (n != 0) {
            int rem = n % 10;
            r = r * 10 + rem;
            n = n / 10;
        }
        if (original == r)
            System.out.println(original + " IS A PALINDROME NUMBER");
        else
            System.out.println(original + " IS NOT A PALINDROME NUMBER ");
    }
}
