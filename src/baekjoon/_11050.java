package baekjoon;

import java.util.Scanner;

/**
 * 문제
 * 
 * 이항계수
 */
public class _11050 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] values = scan.nextLine().split(" ");
        int n = Integer.parseInt(values[0]);
        int k = Integer.parseInt(values[1]);
        int result = factorial(n) / (factorial(k) * factorial(n - k));
        System.out.println(result);
    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
