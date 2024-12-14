package baekjoon;

import java.io.*;

/**
 * 문제 : 팩토리얼 2
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다.
 */
public class _27433 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // when
        long result = factorial(n);

        // then
        System.out.println(result);
    }

    public static long factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : 1;
    }
}
