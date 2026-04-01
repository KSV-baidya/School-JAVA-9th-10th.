public class p2_pattern {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (i + 2); j++) {
                if (j == 1 || j == (i + 2))
                    System.out.print("*");
                else
                    System.out.print(j - 1);
            }
            System.out.println();
        }
    }
}

/*   
*1*   
*12*  
*123* 
*1234*
*12345*
*/