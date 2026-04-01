import java.util.Scanner;

public class p4_Fibonacci_series {

    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        // n is the limit to the series going to be printed
        System.out.println(" n is the limit to the series going to be printed ");
        int n = in.nextInt();
        int prev = 0;
        int next = 1;
        System.out.print(prev + " , " + next);
        for (int i = 3; i <= n; i++) {
            int sum = (prev + next);
            System.out.print(" , " + sum);
            prev = next;
            next = sum;
        }
    }
    /*  0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34  */
}