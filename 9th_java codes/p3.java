// input threee sides of a triangle and check whether it is a right angled triangle
import java.util.Scanner;
public class p3{
    public static void main (String [] args ){
        Scanner in = new Scanner(System.in);
          System.out.println ("ENTER THE FIRST SIDE");
    int a =in.nextInt();
    System.out.println ("ENTER THE SECOND SIDE ");
    int b= in.nextInt ();
    System.out.println ("ENTER THE THIRD SIDE ");
    int c= in.nextInt ();

    if(  a*a + b*b==c*c || c*c + b*b== a*a || a*a + c*c== b*b ){
        System.out.println( " YES IT IS A RIGHT ANGLED TRIANGLE " );
    }
    else 
        System.out.println ( " NO IT IS NOR A RIGHT ANGLED TRIANGLE ");
    }
}