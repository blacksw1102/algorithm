package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제 : N과 M (1)
 * - 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * - 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 *
 * 입력
 * - 첫째 줄에 자연수 N과 M이 주어진다. (1 <= M <= N <= 8)
 *
 * 출력
 * - 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다.
 * - 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 * - 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 */
public class _15649_2 {

    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int depth = 0;
        int[] arr = new int[m];
        boolean[] visit = new boolean[n];

        // when
        String result = tracking(n, m, depth, arr, visit);

        // then
        System.out.print(result);
    }

    public static String tracking(int n, int m, int depth, int[] arr, boolean[] visit) {
        // given
        StringBuilder sb = new StringBuilder();

        // when
        if (depth < m) {
            for (int i = 0; i < n; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    arr[depth] = i + 1;
                    sb.append(tracking(n, m, depth + 1, arr, visit));
                    visit[i] = false;
                }
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

        // then
        return sb.toString();
    }

}
