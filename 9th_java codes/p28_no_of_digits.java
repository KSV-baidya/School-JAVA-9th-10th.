import java.util.Scanner;

public class p28_no_of_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER THAT YOU WANT TO COUNT ITS NUMBER OF DIGITS. ");
        int n = in.nextInt();
        int x = 0;
        int original = n;
        while (n != 0) {
            x++;
            n = n / 10;
        }
        System.out.println("THE NUMBER OF DIGITS IN " + original + " IS " + x);
    }
}
