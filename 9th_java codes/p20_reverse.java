
//to reverse the number given y the user 
import java.util.Scanner;

public class p20_reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE REVERSED ");
        int n = in.nextInt();
        int original = n;
        System.out.println(" THE NUMEBR BEFORE REVERSING IS " + original);
        int r = 0;
        while (n != 0) {
            int rem = n % 10;
            r = r*10 + rem;
            n =n/ 10;
        }
        System.out.println(" THE NUMBER THAT IT BECAME AFTER REVERSING IS " + r);
    }
}
