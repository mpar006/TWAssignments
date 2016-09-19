package diamond;

import java.util.Scanner;

/**
 * Created for first Diamond exercise
 */
public class Isosceles {
    public static void main(String[] args) {
        System.out.println("Give a number n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int j = 1; j <= n; j++ ) {
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
