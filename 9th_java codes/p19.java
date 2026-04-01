//to accept two numerbs and find the sum of the last digit of both he numbers

import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER  THE FIRST NUMBER ");
        int a = in.nextInt();
        System.out.println("ENTER  THE SECOND NUMBER ");
        int b = in.nextInt();
        int c = a%10; //to store the last digit of a 
        int d = b%10; //to store tyhe last digit of b 
        int s = c+d;
        System.out.println("THE SUM OF THE LAST DIGIT OF THE NUMBERS GIVEN BY THE USER IS "+s);

    }
}
