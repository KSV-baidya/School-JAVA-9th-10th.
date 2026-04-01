
// PASCALS TRIANGLE IN  THE FORM OF RIGHT TRIANGLE
import java.util.Scanner;

public class p32_PASCALS_NO_2 {
public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("ENTER THE NUMBER UPTO WHICH YOU WANT TO PRINT IN FORM OF PASCALS TRIANGLE ");
      int n = in.nextInt();

      for(int row = 0; row <n; row++) {
         int num = 1;

         for(int col = 0; col <= row; col++) {
            System.out.print(num+" ");
           num = num * (row  - col) / (col+1);
         }

         System.out.println();
      }

   }
}
