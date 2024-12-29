package baekjoon;

import java.util.*;
import java.io.*;

public class _1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int result = minus(str);

        System.out.println(result);
    }

    public static int minus(String str) {
        StringTokenizer stMinus = new StringTokenizer(str, "-");
        int result = Integer.MIN_VALUE;

        while (stMinus.hasMoreTokens()) {
            int value = plus(stMinus.nextToken());
            result = (result == Integer.MIN_VALUE) ? value : result - value;
        }

        return result;
    }

    public static int plus(String str) {
        StringTokenizer st = new StringTokenizer(str, "+");
        int result = Integer.MIN_VALUE;

        while (st.hasMoreTokens()) {
            int value = Integer.parseInt(st.nextToken());
            result = (result == Integer.MIN_VALUE) ? value : result + value;
        }

        return result;
    }

}