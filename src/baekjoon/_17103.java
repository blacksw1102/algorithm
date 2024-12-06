package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class _17103 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(scan.nextLine());

        // 소수 배열 초기화
        boolean[] arr = new boolean[1_000_000];
        for (int j = 2; j <= arr.length; j++) {
            if (!arr[j - 1]) {
                int temp = j + j;
                while (temp <= arr.length) {
                    arr[temp - 1] = true;
                    temp += j;
                }
            }
        }

        // 골드바흐 파티션의 개수 추출
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(scan.nextLine());
            int count = 0;
            for (int j = 2; j + j <= value; j++) {
                if (!arr[j - 1] && !arr[value - j - 1]) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }

        bw.flush();
    }
}
