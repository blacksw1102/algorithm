package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i - 1] >= arr[i]) {
                count += arr[i - 1] - arr[i] + 1;
                arr[i - 1] -= arr[i - 1] - arr[i] + 1;
            }
        }

        System.out.println(count);
    }
}
