package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1789 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        long sum = 0;
        long num = 1;
        long count = 0;

        // when
        while (sum <= s) {
            sum += num;
            num++;
            count++;
        }
        count--;

        // then
        System.out.println(count);
    }
}
