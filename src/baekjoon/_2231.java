package baekjoon;

import java.util.Scanner;

public class _2231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int constructor = 0;
        for (int i = 0; i < n; i++) {
            int value = i;
            int sum = value;

            while (value > 0) {
                sum += value % 10;
                value /= 10;
            }

            if (sum == n) {
                constructor = i;
                break;
            }
        }

        System.out.println(constructor);
    }
}
