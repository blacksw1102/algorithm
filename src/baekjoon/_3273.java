package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int target = Integer.parseInt(br.readLine());
        int startIdx = 0;
        int endIdx = arr.length - 1;
        int count = 0;
        while (startIdx < endIdx) {
            if (arr[startIdx] + arr[endIdx] < target) {
                startIdx++;
            } else if (arr[startIdx] + arr[endIdx] > target) {
                endIdx--;
            } else {
                count++;
                startIdx++;
                endIdx--;
            }
        }

        System.out.println(count);
    }
}
