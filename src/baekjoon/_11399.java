package baekjoon;

import java.io.*;
import java.util.*;

/**
 * 문제 : 11399
 * 분류 : 그리디 알고리즘
 * 배운점 : 각 지점들을 최소 거리 값으로 돌기 위해선 가장 거리가 짧은 지점 순으로 돌아야 한다.
 */
public class _11399 {
    static int n;
    static int[] valueArr;

    public static void main(String[] args) throws IOException {
        init();

        int result = greedy();

        System.out.println(result);
    }

    public static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        valueArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            valueArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(valueArr);
    }

    public static int greedy() {
        int result = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += valueArr[i];
            result += sum;
        }

        return result;
    }

}
