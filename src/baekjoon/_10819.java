package baekjoon;

import java.io.*;
import java.util.*;

public class _10819 {
    static int n, max;
    static int[] valueArr, usedArr;
    static boolean[] visitedArr;

    public static void main(String[] args) throws IOException {
        init();

        track(0);

        System.out.println(max);
    }

    public static void track(int depth) {
        if (depth < n) {
            for (int i = 0; i < n; i++) {
                if (!visitedArr[i]) {
                    visitedArr[i] = true;
                    usedArr[depth] = valueArr[i];
                    track(depth + 1);
                    visitedArr[i] = false;
                }
            }
        } else {
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += Math.abs(usedArr[i] - usedArr[i + 1]);
            }
            if (max < sum) {
                max = sum;
            }
        }
    }

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        valueArr = new int[n];
        for (int i = 0; i < n; i++) {
            valueArr[i] = Integer.parseInt(st.nextToken());
        }
        usedArr = new int[n];
        visitedArr = new boolean[n];
    }
}
