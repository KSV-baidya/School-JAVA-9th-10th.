//to print the marks based on the input taken
import java.util.Scanner;
public class p7 {
            public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);
            System.out.println("ENTER THE MARKS");         
            int n = in.nextInt();
            if (n>=80)
                System.out.println("A");
            else if (n>=60)
                System.out.println("B");
            else if (n<60)
                System.out.println("C");
            else 
                System.out.println("INVALID INPUT.");
        }
    }





