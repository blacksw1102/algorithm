package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[10_000];

        // 배열 초기화
        for (int i = 0; i < n; i++) {
            int idx = Integer.parseInt(reader.readLine()) - 1;
            arr[idx]++;
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append(i + 1).append("\n");
            }
        }
        System.out.println(sb);
    }

}
