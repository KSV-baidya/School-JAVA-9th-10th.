
// PASCALS TRIANGLE IN  THE FORM OF SCALENE TRIANGLE
import java.util.Scanner;

public class p31_PASCALS_TRIANGLE {
public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("ENTER THE NUMBER UPTO WHICH YOU WANT TO PRINT IN FORM OF PASCALS TRIANGLE ");
      int n = in.nextInt();

      for(int row = 0; row <n; row++) {
         for(int s = 1; s < (n - row); s++) {
            System.out.print( " ");
         }

         int num = 1;

         for(int col = 0; col <= row; col++) {
            System.out.print(num+" ");
           num = num * (row  - col) / (col+1);
         }

         System.out.println();
      }

   }
}
