//take input of four digit number and print the middle digits.
import java.util.Scanner;
public class P2 {
public static void main(String [] args){
    Scanner in = new Scanner ( System.in );
    System.out.println(" ENTER THE NUMBER ");
    int a = in.nextInt();
     int b = (a/10)%100;
     System.out.println(b+" are the middle digits of the input ");
}
}


