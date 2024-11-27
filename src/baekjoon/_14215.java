package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _14215 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringTokenizer tokenizer = new StringTokenizer(scan.nextLine(), " ");

        // 초기화
        int[] values = new int[3];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(tokenizer.nextToken());
        }

        // 정렬
        Arrays.sort(values);

        // 가장 큰 변 치환
        if (values[0] + values[1] <= values[2]) {
            values[2] = values[0] + values[1] - 1;
        }

        // 출력
        System.out.println(values[0] + values[1] + values[2]);
    }
}
