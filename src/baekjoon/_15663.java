package baekjoon;

import java.io.*;
import java.util.*;

public class _15663 {

    static int n, m;
    static int[] trackArr, valueArr;
    static boolean[] visitArr;

    public static void main(String[] args) throws IOException {
        int depth = 0;
        init();

        String result = track(depth);

        System.out.print(result);
    }

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        trackArr = new int[m];
        visitArr = new boolean[n];

        st = new StringTokenizer(br.readLine());
        valueArr = new int[n];
        for (int i = 0; i < n; i++) {
            valueArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(valueArr);
    }

    public static String track(int depth) {
        StringBuilder sb = new StringBuilder();
        int beforeValue = -1;

        if (depth < m) {
            for (int i = 0; i < n; i++) {
                if (visitArr[i] || beforeValue == valueArr[i]) {
                    continue;
                }
                visitArr[i] = true;
                trackArr[depth] = valueArr[i];
                beforeValue = valueArr[i];
                sb.append(track(depth + 1));
                visitArr[i] = false;
            }
        } else {
            for (int i = 0; i < m; i++) {
                sb.append(trackArr[i]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}
