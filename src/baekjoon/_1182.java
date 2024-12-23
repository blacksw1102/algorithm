package baekjoon;

import java.io.*;
import java.util.*;

public class _1182 {
    static int n;
    static int s;
    static int[] valueArr;
    static int count;

    public static void main(String[] args) throws IOException {
        init();

        track(0, 0);

        System.out.println(count);
    }

    public static void track(int start, int sum) {
        for (int i = start; i < n; i++) {
            sum += valueArr[i];
            if (sum == s) {
                count++;
            }
            track(i + 1, sum);
            sum -= valueArr[i];
        }
    }

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        valueArr = new int[n];
        for (int i = 0; i < n; i++) {
            valueArr[i] = Integer.parseInt(st.nextToken());
        }

        count = 0;
    }

}
