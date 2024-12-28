package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        int change = 1000 - price;
        int[] rate = {500, 100, 50, 10, 5, 1};

        int[] rateCount = new int[rate.length];
        for (int i = 0; i < rate.length; i++) {
            rateCount[i] = change / rate[i];
            change = change - change / rate[i] * rate[i];
        }

        int count = 0;
        for (int i = 0; i < rateCount.length; i++) {
            count += rateCount[i];
        }

        System.out.println(count);
    }
}
