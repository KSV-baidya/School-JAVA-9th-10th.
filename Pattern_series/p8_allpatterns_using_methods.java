import java.util.Scanner;

public class p8_allpatterns_using_methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF LINES ");
        int n = in.nextInt();
        System.out.println("ENTER THE NUMBER OF LINES OF SPACE BETWEEN EACH PATTERN ");
        int s = in.nextInt();
        space(s);
        pattern1(n);
        space(s);
        pattern2(n);
        space(s);
        pattern3(n);
        space(s);
        pattern4(n);
        space(s);
        pattern5(n);
        space(s);
        pattern6(n);
        space(s);
        pattern7(n);
        space(s);
        pattern8(n);
        space(s);
        pattern9(n);
        space(s);
        pattern10(n);
        space(s);
        pattern11(n);
        space(s);
        pattern13(n);
        space(s);
        pattern14(n);
        space(s);
        pattern15(n);
        space(s);
        pattern16(n);
        space(s);
    }

    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 0; s <= (n - i); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i* 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (i + j == 6 || j - i == 4 || i == n) {
                    System.out.print("*");
                }
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((j - i) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= (n - i) + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void space(int s) {
        System.out.println();
    }

    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (i == 1 || i - j == 0 || (i + j == 10))
                    System.out.print("*");
                 else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (i == n || i + j == 6 || j - i == 4)
                    System.out.print("*");
                 else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        int x =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=( 2 * n )- 1; j++) {
                if ( i - j == 4 || i - j == 4)
                    System.out.print("*");
                 else 
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = (n-x ); i>=1; i--) {
            for (int j = 1; j <=( 2 * i )+1 ; j++) {
                if (i + j == 6 || i - j == 4)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
            x++;
        }
    }

}
