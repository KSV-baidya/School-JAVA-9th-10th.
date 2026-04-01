//to check whether a person passed or failed based on the marks input
import java.util.Scanner;

public class p11{
        public static void main(String [] args) {
            Scanner in = new Scanner (System.in);
            System.out.println("ENTER THE NAME");
            String b =in.nextLine();
                System.out.println(" ENTER THE MARKS.");
                int a =in.nextInt();

                if (a>=40)
                    System.out.println(b+" has passed the test.");
                else 
                    System.out.println(b+" has failed.");

        }
}