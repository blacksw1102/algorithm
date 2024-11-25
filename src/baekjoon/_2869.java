package baekjoon;

import java.util.Scanner;

/**
 * 풀이 과정
 * an - (b * (n - 1)) >= c
 * an - (bn - b) >= c
 * an - bn + b >= c
 * n (a - b) >= c - b
 * n >= (c - b) / (a - b)
 */
public class _2869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();

        double result = (double) (c - b) / (a - b);

        System.out.printf("%.0f\n", Math.ceil(result));
    }
}
