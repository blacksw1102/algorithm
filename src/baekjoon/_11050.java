package baekjoon;

import java.util.Scanner;

/**
 * 문제 : 이항계수
 * 자연수 N과 정수 K가 주어졌을 때 이항 계수 C(N, K)를 구하는 프로그램을 작성하시오.

 * 입력
 * 첫째 줄에 N과 K가 주어진다. (1 <= N <= 10, 0 <= K <= N)
 *
 * 기록
 * C(N, K) = N! / (K! * (N - K)!)
 */
public class _11050 {
    public static void main(String[] args) {
        // given
        Scanner scan = new Scanner(System.in);
        String[] values = scan.nextLine().split(" ");
        int n = Integer.parseInt(values[0]);
        int k = Integer.parseInt(values[1]);

        // when
        int result = binomialCoefficient(n, k);

        // then
        System.out.println(result);
    }

    public static int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }


    public static int factorial(int value) {
        // given
        int result = 1;

        // when
        for (int i = 1; i <= value; i++) {
            result *= i;
        }

        // then
        return result;
    }
}
