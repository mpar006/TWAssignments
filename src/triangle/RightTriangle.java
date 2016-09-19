package triangle;

import java.util.Scanner;

/**
 *  Created for fourth Triangle exercise
 */
public class RightTriangle {
    public static void main(String[] args) {
        System.out.println("Give a number n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
