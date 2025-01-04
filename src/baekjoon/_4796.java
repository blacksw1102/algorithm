package baekjoon;

import java.io.*;
import java.util.*;

public class _4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int idx = 1;

        while (!(str = br.readLine()).equals("0 0 0")) {
            func(str, idx);
            idx++;
        }
    }

    public static void func(String str, int idx) {
        StringTokenizer st = new StringTokenizer(str);
        int l = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int r = 0;

        while (v > 0) {
            if (v - p >= 0) {
                r += l;
                v -= p;
            } else {
                r += Math.min(l, v);
                v -= p;
            }
        }

        System.out.printf("Case %d: %d\n", idx, r);
    }
}
