import java.util.Scanner;

public class p35_AUTOMORPHIC_NO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO CHECK ITS A AUTOMORPHIC NUMBER ");
        int n = in.nextInt();
        int n1 = n % 10; // to store the last digit of the input number
        int n2 = (n * n) % 10; // to store the last digit of the square of the input number
        //
        if (n1 == n2) {
            System.out.println(n + " IS A AUTOPMORPHIC NUMBER ");
        } else {
            System.out.println(n + " IS NOT A AUTOMORPHIC NUMBER ");
        }
        
    }

}
/*
 * An automorphic number is a number whose square ends in the same digits as the number itself
 */
