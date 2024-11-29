package baekjoon;

import java.util.Scanner;

public class _19532 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();

        int resultX = 0;
        int resultY = 0;
        boolean isEnd = false;
        for (int x = -999; !isEnd && x <= 999; x++) {
            for (int y = -999; !isEnd && y <= 999; y++) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    resultX = x;
                    resultY = y;
                    isEnd = true;
                }
            }
        }

        System.out.println(resultX + " " + resultY);
    }
}
