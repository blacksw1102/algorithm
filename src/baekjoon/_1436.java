package baekjoon;

import java.util.Scanner;

public class _1436 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int from = 0;
        int to = scan.nextInt();
        int value = 0;

        while (from != to) {
            value++;
            if (String.valueOf(value).contains("666")) {
                from++;
            }
        }

        System.out.println(value);
    }
}
