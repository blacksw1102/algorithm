package baekjoon;

import java.util.Scanner;

public class _15894 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long level = scan.nextInt();
        long answer = 0;

        answer += level; // 윗면
        answer += level * 2; // 옆면
        answer += level; // 아랫면

        System.out.println(answer);
    }
}
