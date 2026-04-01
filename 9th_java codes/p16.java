//take switch case and choose between 3 options 
//to find the area of rectangle,circle and square based on the choice of the user on the switch case choice 
import java.util.Scanner;
public class p16{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("ENTER 1 FOR AREA OF RECTANGLE ");
            System.out.println("ENTER 2 FOR AREA OF CIRCLE ");
            System.out.println("ENTER 3 FOR AREA OF SQUARE");
             int n =in.nextInt();
             double area = 0.0;
            switch (n) {
                case 1: 
                System.out.println("enter length");
                int l = in.nextInt();
                System.out.println("enter breadth");
                int b = in.nextInt();
                area = l*b ;
                   System.out.print("THE AREA OF RECTANGLE IS ");
                break;
                case 2:
                 System.out.println(" enter the value of radius ");
                 int r =in.nextInt();
                 area = Math.PI * r* r;
                             System.out.print("THE AREA OF THE CIRCLE IS");
                 case 3:
                   System.out.println("enter the value of side of the square ");
                   int s = in.nextInt();
                   area = s*s;
                               System.out.print("THE AREA OF THE SQUARE IS ");
                default:
                  System.out.println(" INVALID INPUT ");
            }
                        System.out.print(area);

        }
}
    

