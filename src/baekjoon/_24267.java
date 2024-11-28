package baekjoon;

import java.util.Scanner;

/**
 * n = 수행 횟수 (+증가 값)
 * 1 = 0
 * 2 = 0 (+0)
 * 3 = 1 (+1)
 * 4 = 4 (+3)
 * 5 = 10 (+6)
 * 6 = 20 (+10)
 * 7 = 35 (+15)
 * 8 = 56 (+21)
 * ...
 */
public class _24267 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();

        long sum = 0;
        long a = 0;
        long b = 0;
        for (int i = 2; i <= n; i++) {
            sum += b;
            a += 1;
            b += a;
        }

        System.out.println(sum);
        System.out.println(3);
    }
}
