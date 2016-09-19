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
}
