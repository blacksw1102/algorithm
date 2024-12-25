package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10974 {
    static int n;
    static int[] valueArr;
    static int[] trackArr;
    static boolean[] visitedArr;

    public static void main(String[] args) throws IOException {
        init();

        String result = track(0);

        System.out.print(result);
    }

    public static String track(int depth) {
        StringBuilder sb = new StringBuilder();

        if (depth < n) {
            for (int i = 0; i < n; i++) {
                if (!visitedArr[i]) {
                    visitedArr[i] = true;
                    trackArr[depth] = valueArr[i];
                    sb.append(track(depth + 1));
                    visitedArr[i] = false;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                sb.append(trackArr[i]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        valueArr = new int[n];
        for (int  i = 0; i < n; i++) {
            valueArr[i] = i + 1;
        }

        trackArr = new int[n];
        visitedArr = new boolean[n];
    }
}
