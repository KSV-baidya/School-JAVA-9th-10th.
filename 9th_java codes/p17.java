//use switch code to take input of the user and find either maximum, reminder and to the power of the values taken
import java.util.Scanner;
public class p17 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("ENTER 1 FOR THE MAXIMUM OF TWO VALUES, 2 FOR THE REMINDER OF THE GREATER NUMBER TO THE SMALLER NUMBER AND 3 FOR FINDING THE POWER TO  NUMBER. ");
                int choice = in.nextInt();
                 
                switch (choice){
                    case 1 : {
                    System.out.println("enter the first number ");
                    int a = in.nextInt();
                     System.out.println("enter the second number ");
                     int b = in.nextInt();
                     if (a>b)
                   System.out.println(a+" is maximum ");
                else if (b>a)
                      System.out.println(b+" is maximum ");
                    else 
                          System.out.println("both are same value ");
                        break;
                    }
                        case 2 :{
                            System.out.println("enter the dividend ");
                    int a =in.nextInt();
                      System.out.println("enter the divisor ");
                    int b =in.nextInt();
                    int r = a%b;
                    System.out.println("the reminder of the two values is"+r);
                    break;
                        }
                    case 3:{
                        System.out.println(" enter the number which u want to find the power to");
                        int a =in.nextInt();
                        System.out.println("enter the value of exponent for the finding of power ");
                        int b = in.nextInt();
                            double  pow = Math.pow(a,b);
                          System.out.println("the value of the power of the number is "+pow);  
                          break ;
                    }
                          default:
                              System.out.println("INVALID INPUT ");      
                }

            
            }
}
