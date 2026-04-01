//to input a number from 1 to 5 and print it in alphabets using switch case
import java.util.Scanner;
public class p6 {
            public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);

                    System.out.println("ENTER NUMBERE FROM 1 TO 5. ");
                    int n = in.nextInt();

                    switch (n){
                        case 1:System.out.println("ONE ");
                        break;
                         case 2 :System.out.println("TWO ");
                        break;
                         case 3:System.out.println("THREE ");
                        break;
                         case 4:System.out.println("FOUR ");
                        break;
                         case 5:System.out.println("FIVE ");
                        break;
                        default: System.out.println("INVALID INPUT.");
                    }
            }   
}
