package baekjoon;

import java.io.*;
import java.util.*;

public class _1946 {
    static BufferedReader br;
    static StringBuilder sb;
    static int t;
    static int[] arr;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        // given
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        t = Integer.parseInt(br.readLine());

        // when
        for (int i = 0; i < t; i++) {
            arr = getArr();
            count = count();
            sb.append(count).append("\n");
        }

        // then
        System.out.println(sb);
    }

    public static int[] getArr() throws IOException {
        // given
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        // when
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int documentRank = Integer.parseInt(st.nextToken());
            int interviewRank = Integer.parseInt(st.nextToken());
            arr[documentRank - 1] = interviewRank;
        }

        // then
        return arr;
    }

    public static Integer count() {
        // given
        int count = 1;
        int min = arr[0];

        // when
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                count++;
                min = arr[i];
            }
        }

        // then
        return count;
    }

}