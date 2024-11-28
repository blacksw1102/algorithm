package baekjoon;

import java.util.Scanner;

/**
 * O(g(n)) = f(n)
 * = O(n) = f(n)
 * => g(n) = n
 *
 * f(n) = a1 * n + a0
 * = f(n) <= c * g(n)
 * = a1 * n + a0 <= c * n
 * = a1 * n <= c * n
 * = a1 <= c
 */
public class _24313 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a0 = scan.nextInt();
        int c = scan.nextInt();
        int n0 = scan.nextInt();

        boolean flag = a1 <= c && a1 * n0 + a0 <= c * n0;
        System.out.println(flag ? 1 : 0);
    }
}
