package numbers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created for prime factors exercise
 */
public class PrimeFactors {

    public static void main(String[] args) {
        System.out.println("Give a number n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.print("The prime factors of " + n + " are:");
        for(Integer i : generate(n)) {
            System.out.print(i);
        }
    }

    private static ArrayList<Integer> generate(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
