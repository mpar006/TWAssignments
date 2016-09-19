package triangle;

import java.util.Scanner;

/**
 *  Created for third Triangle exercise
 */
public class Vertical {
    public static void main(String[] args) {
        System.out.println("Give a number n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}
