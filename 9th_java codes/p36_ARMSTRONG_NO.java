import java.util.Scanner;

import org.xml.sax.SAXException;

public class p36_ARMSTRONG_NO {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER U WANT TO CHECK ");
        int num = in.nextInt();
        int temp = num;
        int rem = 0;
        int sum = 0;
        while (temp != 0) {
            temp = temp / 10;
            rem++;
        }
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (int) (Math.pow(digit, rem));
            temp = temp / 10;
        }
        if (num == sum)
            System.out.println(num + " IS AN ARMSTRONG NUMBER ");
        else
            System.out.println(num + " IS NOT A ARMSTRONG NUMBER ");
    }
}

/*
 * an Armstrong number is a number that is equal to the sum of its own digits,
 * each raised to the power of the total number of digits /* /*
 */