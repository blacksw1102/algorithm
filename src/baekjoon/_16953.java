package baekjoon;

import java.io.*;
import java.util.*;

public class _16953 {

    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        // when
        recursive(a, b, 0);

        // then
        System.out.println(result != Integer.MAX_VALUE ? result : -1);
    }

    public static void recursive(long a, long b, int count) {
        // given

        // when
        if (a < b) {
            recursive(a * 10 + 1, b, count + 1);
            recursive(a * 2, b, count + 1);
        } else if (a == b) {
            result =  Math.min(result, count + 1);
        }

        // then
    }

}
