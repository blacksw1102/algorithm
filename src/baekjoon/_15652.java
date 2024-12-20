package baekjoon;

import java.io.*;
import java.util.*;

/**
 * 문제 :
 * - 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * - 1부터 N까지 자연수 중에서 M개를 고른 수열
 * - 같은 수를 여러 번 골라도 된다.
 * - 고른 수열은 비내림차순이어야 한다.
 *
 * 입력
 * - 첫째 줄에 자연수 N과 M이 주어진다. (1 <= M <= N <= 8)
 *
 * 출력
 * - 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다.
 */
public class _15652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        int depth = 0;
        int start = 0;

        String result = tracking(n, m, arr, depth, start);

        System.out.print(result);
    }

    public static String tracking(int n, int m, int[] arr, int depth, int start) {
        StringBuilder sb = new StringBuilder();

        if (depth < m) {
            for (int i = start; i < n; i++) {
                arr[depth] = i + 1;
                sb.append(tracking(n, m, arr, depth + 1, i));
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
                if (i + 1 < arr.length) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}
