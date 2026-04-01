//to find out the square of an input
import java.util.Scanner;
public class p14 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("ENTER THE INPUT OF A NUMBER. ");
            int a=in.nextInt();
            if (a==0){
                System.out.println("THE VALUE CANNOT BE ZERO. ");
                System.exit(0);
            }
            else 
                System.out.println(" THE SQUARE VALUE IS "+(a*a));
        }
}
