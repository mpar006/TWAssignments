package diamond;

import java.util.Scanner;

/**
 * Created for second Diamond exercise
 */
public class Diamond extends Isosceles {
    public static void main(String[] args) {
        System.out.println("Give a number n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        printTriangle(n);
        printReverseTriangle(n-1);
    }

    static void printReverseTriangle(int n) {
        for(int j = n; j >= 1; j--) {
            for (int i = 0; i < n - j + 1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
