import java.util.Scanner;

public class p37_STRONG_NO {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE DESIRED NUMBER TO BE CHECKED ");
        int num = in.nextInt();
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = sum * fact;
            }
            sum = sum + fact;
            temp = temp / 10;
        }
        if (num == sum)
            System.out.println(num + " IS A STRONG NUMBER");
        else
            System.out.println(num + " IS NOT A STRONG NUMBER ");
    }
}
/* A Strong Number (also known as a Krishnamurthy number or factorion) is a special number where the sum of the factorials of its digits equals the original number itself */