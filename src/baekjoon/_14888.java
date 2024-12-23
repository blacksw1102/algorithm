package baekjoon;

import java.io.*;
import java.util.*;

public class _14888 {
    static int[] valueArr;
    static int[] operArr;

    static int[] trackOperArr;
    static boolean[] visitOperArr;
    static long max;
    static long min;

    public static void main(String[] args) throws IOException {
        init();

        track(0, valueArr[0]);

        System.out.println(max);
        System.out.println(min);
    }

    public static void track(int depth, long result) {
        if (depth < operArr.length) {
            for (int i = 0; i < operArr.length; i++) {
                if (!visitOperArr[i]) {
                    visitOperArr[i] = true;
                    switch (operArr[i]) {
                        case 0: track(depth + 1, result + valueArr[depth + 1]); break;
                        case 1: track(depth + 1, result - valueArr[depth + 1]); break;
                        case 2: track(depth + 1, result * valueArr[depth + 1]); break;
                        case 3: track(depth + 1, result / valueArr[depth + 1]); break;
                    }
                    visitOperArr[i] = false;
                }
            }
        } else {
            max = Math.max(max, result);
            min = Math.min(min, result);
        }
    }

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        valueArr = new int[n];
        for (int i = 0; i < n; i++) {
            valueArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        operArr = new int[n - 1];
        int idx = 0;
        for (int i = 0; i < 4; i++) {
            int count = Integer.parseInt(st.nextToken());
            for (int j = 0; j < count; j++) {
                operArr[idx++] = i;
            }
        }
        trackOperArr = new int[n - 1];
        visitOperArr = new boolean[n - 1];

        max = Long.MIN_VALUE;
        min = Long.MAX_VALUE;
    }

}
