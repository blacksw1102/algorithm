package baekjoon;

import java.util.Scanner;

/**
 * 문제
 *
 * 팩토리얼
 */
public class _10872 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
