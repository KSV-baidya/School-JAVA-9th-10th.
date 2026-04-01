//THE USAGE OF BITWISE OPERATOR.
import java.util.Scanner;
public class p15 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println ("ENTER THE FIRST NUMBER");
                int a =in.nextInt();
                System.out.println ("ENTER THE SECOND NUMBER");
                int b =in.nextInt();
                double AND = a&b;
                double OR =a|b;
                double XOR = a^b;
                double LEFT = a<<b;
                double RIGHT = a>>b;
                System.out.println ("THE BITWISE AND VALUE IS "+AND);
                System.out.println ("THE BITWISE OR VALUE IS "+OR);
                System.out.println ("THE BITWISE XOR VALUE IS "+XOR);
                System.out.println ("THE BITWISE LEFT SHIFT VALUE IS "+LEFT);
                System.out.println ("THE BITWISE RIGHT SHIFT VALUE IS "+RIGHT);
                System.out.println ("THE BITWISE not VALUE IS "+(~a));


            }
    
}
