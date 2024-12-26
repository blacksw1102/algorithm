package baekjoon;

import java.io.*;
import java.util.*;

public class _1026 {
    static int n;
    static Integer[] aArr, bArr;

    public static void main(String[] args) throws IOException {
        init();

        Arrays.sort(aArr);
        Arrays.sort(bArr, Collections.reverseOrder());

        System.out.println(calcS());
    }

    public static int calcS() {
        int s = 0;

        for (int i = 0; i < n; i++) {
            s += aArr[i] * bArr[i];
        }

        return s;
    }

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        aArr = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
        }

        bArr = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            bArr[i] = Integer.parseInt(st.nextToken());
        }
    }

}
