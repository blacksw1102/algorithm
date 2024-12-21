package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 :
 * - N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
 * - N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * - 첫째 줄에 N이 주어진다. (1 <= N < 15)
 *
 * 출력
 * - 첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.
 */
public class _9663 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int row = 0;

        int count = tracking(n, arr, row);

        System.out.println(count);
    }

    public static int tracking(int n, int[] arr, int row) {
        int count = 0;

        if (row == n) {
            count++;
        } else {
            for (int col = 0; col < n; col++) {
                if (validate(arr, row, col)) {
                    arr[row] = col;
                    count += tracking(n, arr, row + 1);
                }
            }
        }

        return count;
    }

    public static boolean validate(int[] arr, int row, int col) {
        boolean result = true;

        for (int i = 0; i < row; i++) {
            boolean condition1 = arr[i] == col;
            boolean condition2 = Math.abs(i - row) == Math.abs(arr[i] - col);
            if (condition1 || condition2) {
                result = false;
                break;
            }
        }

        return result;
    }
}