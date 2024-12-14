package baekjoon;

import java.util.Scanner;

/**
 * 문제 : 녹색거탑
 * 녹색거탑은 위 그림과 같이 규칙적으로 쌓여있다.
 * - 그림의 시야에 보이지 않는 블록은 없다.
 * - 그림의 시야에 보이는 블록의 윗면만 이용해 녹색거탑을 내려올 수 있다.
 * - 녹색거탑이 N층이면, 총 N개의 블록을 이용한 최단 경로로만 내려온다.
 * - 녹색거탑을 내려올 때는 정상에서 시작해 노란색 바닥까지, 항상 인접한 아래층의 블록으로만 내려온다.
 * 거탑의 정상에서 바닥으로 내려오는 경우의 수를 출력한다.
 *
 * 입력
 * 녹색거탑의 높이를 나타내는 정수 N이 주어진다. (1 <= N <= 5)
 *
 * 기록
 * 0: 0
 * 1: 1 1 => 2
 * 2: 1 2 1 => 4
 * 3: 1 3 3 1 => 8
 * 4: 1 4 6 4 1 => 16
 * 5: 1 5 10 10 15 1 => 32
 */
public class _24723 {
    public static void main(String[] args) {
        // given
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        // when
        int result = (int) Math.pow(2, n);

        // then
        System.out.println(result);
    }
}
