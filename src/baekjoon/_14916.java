package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14916 {

    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        // when
        while (n > 0) {
            if (n % 5 == 0) {
                count += n / 5;
                n %= 5;
            } else {
                n -= 2;
                count++;
            }
        }

        // then
        System.out.println((n == 0) ? count : -1);
    }

}
