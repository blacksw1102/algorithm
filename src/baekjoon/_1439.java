package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1439 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int zeroContinueCount = 0;
        int oneContinueCount = 0;

        // when
        char[] arr = br.readLine().toCharArray();
        char ch = 0;
        for (char value : arr) {
            if (ch != value && value == '0') {
                zeroContinueCount++;
            }
            if (ch != value && value == '1') {
                oneContinueCount++;
            }
            if (ch != value) {
                ch = value;
            }
        }

        int result = Math.min(zeroContinueCount, oneContinueCount);

        // then
        System.out.println(result);
    }
}
