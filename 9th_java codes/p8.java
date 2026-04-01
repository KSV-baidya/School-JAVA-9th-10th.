//to check whether a number is exactly divisible by another number 
import java.util.Scanner;
public class p8{
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("ENTER THE DIVISOR");
                int a = in.nextInt();
                System.out.println("ENTER THE DIVIDEND." );
                int b =in.nextInt();
                 if (a%b==0)
                    System.out.println("YES THE NUMBER IS PERFECTLY DIVISIBLE.");
                else 
                    System.out.println("NO THE NUMBER IS NOT DIVSIBLE BY IT.");
        }
}
