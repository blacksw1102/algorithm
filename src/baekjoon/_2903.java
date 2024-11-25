package baekjoon;

import java.util.Scanner;

/**
 * 0회차: 2
 * 1회차: 3 (+1)
 * 2회차: 5 (+2)
 * 3회차: 9 (+4)
 * 4회차: 17 (+8)
 * 5회차: 33 (+16)
 */
public class _2903 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        int n = 2; // 정사각형 한 변의 점 개수
        int m = 1; // 한 사이클당 증가 하는 점 개수
        for (int i = 0; i < count; i++) {
            n += m;
            m *= 2;
        }

        // 정사각형에 찍힌 총 점 개수 (= 한 변의 점 개수 * 한 변의 점 개수)
        System.out.println(n * n);
    }
}
