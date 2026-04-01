import java.util.Scanner;

//input 5 numbers and find the product of the even numbers
public class p33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        int prj = 1;
        while (i <= 5) {
            int n = in.nextInt();
            if (n % 2 == 0) {
                prj = prj * n;

            } else {
                continue;
            }
            i++;
        }
        System.out.println("THE PRODUCT OF 5 EVEN NUMBERS " + prj);

    }
}
