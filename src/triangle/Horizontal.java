package triangle;

import java.util.Scanner;

/**
 * Class for second Triangle assignment
 */
public class Horizontal {
    public static void main(String[] args) {
        System.out.println("Give a number n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
