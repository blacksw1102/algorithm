package baekjoon;

import java.util.Scanner;

/**
 * 문제 : 베라의 패션
 * - 베라는 상의 N 벌과 하의 N 벌이 있다. i 번째 상의와 i 번째 하의는 모두 색상 i를 가진다. N 개의 색상은 모두 서로 다르다.
 * - 상의와 하의가 서로 다른 색상인 조합은 총 몇 가지일까?
 */
public class _15439 {
    public static void main(String[] args) {
        // given
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        // when
        int result = n * (n - 1);

        //then
        System.out.println(result);
    }
}
