package baekjoon;

import java.io.*;
import java.util.*;

public class _6603 {
    static final int max = 6;
    static int[] trackArr = new int[max];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(st.nextToken());

            if (length == 0) {
                break;
            }

            int[] valueArr = new int[length];
            for (int i = 0; i < length; i++) {
                valueArr[i] = Integer.parseInt(st.nextToken());
            }
            int depth = 0;
            int start = 0;
            Arrays.sort(valueArr);
            String result = track(valueArr, depth, start);
            System.out.print(result);
            System.out.println();
        }
    }

    public static String track(int[] valueArr, int depth, int start) {
        StringBuilder sb = new StringBuilder();

        if (depth < max) {
            for (int i = start; i < valueArr.length; i++) {
                trackArr[depth] = valueArr[i];
                sb.append(track(valueArr, depth + 1, i + 1));
            }
        } else {
            for (int i = 0; i < max; i++) {
                sb.append(trackArr[i]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
