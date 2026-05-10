
import java.util.Scanner;
import java.util.Arrays;

public class practise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of the array");
            arr[i] = in.nextInt();
        }
        // System.out.println("The array is " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
