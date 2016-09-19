package diamond;

import java.util.Scanner;

/**
 * Created for third Diamond exercise
 */
public class Name extends Diamond {
    public static void main(String[] args) {
        System.out.println("Give a number n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        printTriangle(n);
        System.out.println("Michael");
        printReverseTriangle(n-1);
    }

    static void printTriangle(int n) {
        for(int j = 1; j <= n-1; j++ ) {
            for(int i = 0; i < n-j; i++) {
                System.out.print(" ");
            }
            for(int i = 0; i < 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
