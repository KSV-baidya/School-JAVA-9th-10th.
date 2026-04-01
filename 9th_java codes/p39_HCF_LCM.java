import java.util.Scanner;

public class p39_HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" ENTER THE FIRST NUMBER ");
        int a = in.nextInt();
        System.out.println(" ENTER THE SECOND NUMBER ");
        int b = in.nextInt();
        int x = a, y = b;
        while (a != 0) {
            int rem = b % a;
            b = a;
            a = rem;
        }
        System.out.println("HCF = " + b);
        System.out.println("LCM = " + (x * y) / b);

    }
}