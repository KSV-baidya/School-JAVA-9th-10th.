//to find maximum of three numbers
import java.util.Scanner;
public class p4 {
    public static void main ( String [] args ){
    Scanner in = new Scanner ( System.in);
    System.out.println("enter the first number.");
    int a = in.nextInt () ;
    System.out.println("enter the second numkber.");
    int b = in.nextInt();
    System.out.println("enter the third number.");
int c = in.nextInt ();
int max = a;

if (a>b && a>c)
    max = a ;
else if (b>a && b>c)
    max=b;
else if (c>a && c>b)
    max = c;
else {
    System.out.println("All values are same.");
}
System.out.println("the maximum value is "+max);

    

    }
}
