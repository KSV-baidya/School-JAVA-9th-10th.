import java.util.Scanner;

public class p30_FLOIDS_TRIANGLE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS YOU WANT TO PRINT IN THE FORM OF FLOIDS TRIANGLE ");
        int n = in.nextInt();
        int x= 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }

    }

}
