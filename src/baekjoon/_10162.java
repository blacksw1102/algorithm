package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[3];

        count[0] += n / 300;
        n %= 300;

        count[1] += n / 60;
        n %= 60;

        count[2] += n / 10;
        n %= 10;

        if (n == 0) {
            System.out.println(count[0] + " " + count[1] + " " + count[2]);
        } else {
            System.out.println(-1);
        }
    }
}
