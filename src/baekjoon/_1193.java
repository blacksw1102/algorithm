package baekjoon;

import java.util.Scanner;

public class _1193 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int from = 1;
        int to = scan.nextInt();

        int a = 1;
        int b = 1;
        int goal = 2;
        boolean keepLoop = true;
        while (keepLoop) {
            // 분자 감소 && 분모 증가
            while (keepLoop && b < goal) {
                if (from < to) {
                    if (a > 1) {
                        a--;
                    }
                    b++;
                    from++;
                } else {
                    keepLoop = false;
                }
            }
            goal++;
            // 분자 증가 && 분모 감소
            while (keepLoop && a < goal) {
                if (from < to) {
                    if (b > 1) {
                        b--;
                    }
                    a++;
                    from++;
                } else {
                    keepLoop = false;
                }
            }
            goal++;
        }

        System.out.println(a + "/" + b);
    }
}
