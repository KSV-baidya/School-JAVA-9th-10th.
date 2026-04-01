//to enter the grade and divide the students based on it.
import java.util.Scanner;

public class p12 {
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            System.out.println("ENTER THE GRADE.");
           char a = in.next().charAt(0);
            switch(a){
                case 'A' : System.out.println("VERY GOOD>");
                break;
                case 'B' : System.out.println("GOOD.");
                break;
                case 'C' : System.out.println("PASSED. ");
                break;
                case 'D' : System.out.println("TRY HARDER NEXT TIME ");
                break;
                default : System.out.println("IVALID INPUT ");

            }
        }
}
