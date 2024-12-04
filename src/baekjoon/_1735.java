package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1735 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st;

        // 값 초기화
        st = new StringTokenizer(scan.nextLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(scan.nextLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        // 두 분수의 합
        int a3 = a1 * b2 + a2 * b1;
        int b3 = b1 * b2;

        // 기약 분수 계산
        int gcd = euclid(a3, b3);
        int a4 = a3 / gcd;
        int b4 = b3 / gcd;

        // 출력
        System.out.println(a4 + " " + b4);
    }

    public static int euclid(int a, int b) {
        int r = a;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
