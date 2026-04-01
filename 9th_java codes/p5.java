//to calculate 7 days fo a week.
import java.util.Scanner;
public class p5 {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        System.out.println("ENTER THE NO OF THE DAY YOU WANT TO KNOW");
        int a = in.nextInt();
        switch(a){
case 1: System.out.println("MONDAY ");
break;
case 2: System.out.println("TUESDAY ");
break;
case 3: System.out.println("WEDNESDAY ");
break;
case 4: System.out.println("THURSDAY ");
break;
case 5: System.out.println("FRIDAY ");
break;
case 6: System.out.println ("SATURDAY ");
break;
case 7: System.out.println("SUNDAY ");
break ;
default : System.out.println("THE INPUT IS INVALID ");
}
 }
}
