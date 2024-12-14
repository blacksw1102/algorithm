package baekjoon;

import java.util.Scanner;

/**
 * 문제 : 팩토리얼
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
 */
public class _10872 {
    public static void main(String[] args) {
        // given
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        // when
        long result = factorial(n);

        // then
        System.out.println(result);
    }

    public static long factorial(int n) {
        // given
        long result = 1;

        // when
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        // then
        return result;
    }
}
