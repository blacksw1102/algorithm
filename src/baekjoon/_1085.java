package baekjoon;

import java.util.Scanner;

public class _1085 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int min = Math.min(Math.min(x, w - x), Math.min(y, h - y));
        System.out.println(min);
    }
}
