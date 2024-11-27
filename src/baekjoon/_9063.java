package baekjoon;

import java.util.Scanner;

public class _9063 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputCount = scan.nextInt();

        int minX = 0, maxX = 0, minY = 0, maxY = 0;
        for (int i = 0; i < inputCount; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (minX == 0 || minX > x) {
                minX = x;
            }
            if (maxX == 0 || maxX < x) {
                maxX = x;
            }
            if (minY == 0 || minY > y) {
                minY = y;
            }
            if (maxY == 0 || maxY < y) {
                maxY = y;
            }
        }

        System.out.println((maxX - minX) * (maxY - minY));
    }
}
