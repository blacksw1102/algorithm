package baekjoon;

import java.io.*;
import java.util.*;

public class _15650 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int depth = 0;
        int[] arr = new int[m];
        int start = 0;

        // when
        String result = tracking(n, m, depth, arr, start);

        // then
        System.out.println(result);
    }

    public static String tracking(int n, int m, int depth, int[] arr, int start) {
        // given
        StringBuilder sb = new StringBuilder();

        // when
        if (depth < m) {
            for (int i = start; i < n; i++) {
                arr[depth] = i + 1;
                sb.append(tracking(n, m, depth  + 1, arr, i + 1));
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
