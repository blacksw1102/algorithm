package baekjoon;

import java.util.*;
import java.io.*;

public class _1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int minPriceOne = Integer.MAX_VALUE;
        int minPriceSix = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int priceSix = Integer.parseInt(st.nextToken());
            int priceOne = Integer.parseInt(st.nextToken());
            minPriceOne = Math.min(minPriceOne, priceOne);
            minPriceSix = Math.min(Math.min(minPriceSix, priceSix), priceOne * 6);
        }

        int result = (n / 6 * minPriceSix) + Math.min(n % 6 * minPriceOne, minPriceSix);
        System.out.println(result);
    }
}
