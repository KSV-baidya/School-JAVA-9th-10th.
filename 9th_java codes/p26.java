
//to add the even numbers upto the limit given by the user
import java.util.Scanner;

public class p26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
System.out.println("ENTER THE LIMIT UPTO WHICH U WANT TO ADD THE EVEN NUMBERS ");
int n =in.nextInt();
int sum = 0;
        for( int i = 1;i<=n;i++){
            if (i%2==0)
                sum = sum + i;
            else 
                continue;
        }
        System.out.println(sum);
} 
}
