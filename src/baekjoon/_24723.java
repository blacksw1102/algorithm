package baekjoon;

import java.util.Scanner;

/**
 * 문제
 * 거탑의 정상에서 바닥으로 내려오는 경우의 수를 출력한다.
 *
 * 0: 0
 * 1: 1 1 => 2
 * 2: 1 2 1 => 4
 * 3: 1 3 3 1 => 8
 * 4: 1 4 6 4 1 => 16
 * 5: 1 5 10 10 15 1 => 32
 */
public class _24723 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        System.out.println((int) Math.pow(2, n));
    }
}
