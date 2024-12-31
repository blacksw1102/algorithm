package baekjoon;

import java.io.*;
import java.util.*;

public class _1339 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        // when
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            char[] alphabets = br.readLine().toCharArray();
            int length = alphabets.length;
            for (char alphabet : alphabets) {
                int idx = alphabet - 'A';
                arr[idx] += (int) Math.pow(10, length - 1);
                length--;
            }
        }
        Arrays.sort(arr);

        int num = 9;
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += num * arr[i];
            num--;
        }

        // then
        System.out.println(sum);
    }
}
