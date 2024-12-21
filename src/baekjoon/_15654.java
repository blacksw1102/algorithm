package baekjoon;

import java.io.*;
import java.util.*;

public class _15654 {
    static int n;
    static int m;
    static int[] values;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        init();

        String result = tracking(0);

        System.out.println(result);
    }

    public static String tracking(int depth) {
        StringBuilder sb = new StringBuilder();

        if (depth < m) {
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    arr[depth] = values[i];
                    visited[i] = true;
                    sb.append(tracking(depth + 1));
                    visited[i] = false;                }
            }
        } else {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        values = new int[n];
        arr = new int[m];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(values);
    }

}
