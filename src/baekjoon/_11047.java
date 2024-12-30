package baekjoon;

import java.io.*;
import java.util.*;

public class _11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Comparator.reverseOrder());

        int count = 0;
        for (int i = 0; k > 0; i++) {
            count += k / arr[i];
            k %= arr[i];
        }

        System.out.println(count);
    }
}
