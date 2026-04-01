//to take input of two numbers
//find the sum and difference between the numbers 
//the difference cannot go into negative

import java.util.Scanner;
public class p13{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("ENTER THE FIRST NUMBER. ");
            int a = in.nextInt();
            System.out.println("ENTER THE SECOND NUMBER. ");
            int b =in.nextInt();
            System.out.println("THE SUM IS "+ (a+b));
            int diff = 0;
            if (a>b)
                diff=a-b;
            else if (b>a)
                diff=b-a;
            else {
                System.out.println( diff );
                System.exit(0);
            }
            System.out.println("THE POSITIVE DIFFERENCE IS "+diff);
        }
}