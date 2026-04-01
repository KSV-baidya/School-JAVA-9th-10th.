import java.util.Scanner;

public class p29_prime_no {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("ENTER THE NUMBER TO CHECK WHETHER IT IS PRIME OR NOT ");
int n = in.nextInt();
int x =0;
for (int  i = 1;i<=n;i++){
    if ( n%i==0)
        x++;
}
if ( x>2)
    System.out.println(n+" IS A COMPOSITE NUMBER ");
else if ( x== 2)
    System.out.println(n+" IS A PRIME NUMBER ");
else 
    System.out.println(n+" IS NEITHER PRIME NOR COMPOSITE ");
        }

}
