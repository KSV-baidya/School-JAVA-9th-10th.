//to calculate the tax on the incpome based
import java.util.Scanner;
public class p9 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("ENTER THE INCOME OF THE PERSON WHOSE TAX YOU WANNA CALCULATE.");
                double a = in.nextDouble();
                double tax;
                if (a<=100000)
                    tax=0.0;
                else if (a<=150000)
                    tax = (10.0/100)*(a-100000);
                else if ( a<=250000) 
                    tax= 5000.0 + 20.0/100.0*(a-150000.0);
                else 
                    tax = ( 25000.0 + 30.0/100.0*(a-2500000));

                System.out.println("The taxed amount of the person is "+tax);
                
        }
    
}
