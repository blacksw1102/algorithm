package baekjoon;

import java.util.Scanner;

/**
 * 문제
 *
 * - 도시를 동쪽과 서쪽으로 나누는 큰 일직선 모양의 강이 흐르고 있다.
 * - 다리가 없어서 시민들이 강을 건너는데 큰 불편을 겪고 있음을 알고 다리를 짓기로 결심하였다.
 * - 강 주변에서 다리를 짓기에 적합한 곳을 사이트라고 한다.
 * - 강의 서쪽에는 N개의 사이트가 있고 동쪽에는 M개의 사이트가 있다는 것을 알았다. (N ≤ M)
 * - 서쪽의 사이트와 동쪽의 사이트를 다리로 연결하려고 한다. (한 사이트에는 최대 한 개의 다리만 연결될 수 있다.)
 * - 다리를 최대한 많이 지으려고 하기 때문에 서쪽의 사이트 개수만큼 (N개) 다리를 지으려고 한다.
 * - 다리끼리는 서로 겹쳐질 수 없다고 할 때 다리를 지을 수 있는 경우의 수를 구하시오
 */
public class _1010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long[][] dp = initDp();

        int size = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < size; i++) {
            String[] values = scan.nextLine().split(" ");
            int n = Integer.parseInt(values[0]);
            int m = Integer.parseInt(values[1]);
            System.out.println(dp[m][n]);
        }
    }

    public static long[][] initDp() {
        long[][] dp = new long[30][30];
        for (int i = 0; i < 30; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }
        for (int i = 1;  i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                dp[i][j] = dp[i -1][j - 1] + dp[i - 1][j];
            }
        }
        return dp;
    }
}
