//to find the area of a triangle using herons formula
//first check whether its a right angled triangle or not
import java.util.Scanner;
public class p18 {
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
        System.out.println ( " NO IT IS NOT A RIGHT ANGLED TRIANGLE ");


    double s = (a+b+c)/2;  //storing the semi perimeter of the triangle
double area = Math.pow((s*(s-a)*(s-b)*(s-c)),1/2);   //storing the area of the triagle 
System.out.println("THE AREA OF THE TRIANGLE IS "+area);
    }
}
    
