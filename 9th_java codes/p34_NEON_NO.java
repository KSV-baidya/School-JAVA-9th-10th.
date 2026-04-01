import java.util.Scanner;

public class p34_NEON_NO {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("ENTER THE NUMBER TO CHECK WHETHER IT IS A NEON NUMBER. ");
            int num=in.nextInt();
            int num1= num*num;
            int sum =0;
            while (num1 !=0) {
             int rem= num1%10;
             sum = sum+ rem;
             num1=num1/10;
            }
            if ( num == sum ){
                System.out.println(num+ " IS A NEON NUMBER ");
            }
            else {
                System.out.println(num+" IS NOT A NEON NUMBER ");
            }
        }
}



/*  NEON NUMBER IS A NUMBER WHOSE SQUARE OF THE INPUT DIGIT OF THE SUM OF THE DIGITS IS EQUAL TO THAT OF THE INPUT*/