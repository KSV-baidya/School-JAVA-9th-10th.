import java.util.Scanner;

public class p1_series {

    // S = a*a + a*a/2 + a*a/3 + a*a/4 + a*a/5 + a*a/6 +.....nth term

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s = 0.0;
        System.out.println(" enter the value of a ");
        int a = in.nextInt();
        System.out.println(" enter the limit to the series ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            s = s + (a * a) / i;
        }
        System.out.println(s);

    }
}
