package baekjoon;

import java.util.Scanner;

public class _2444 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int a = n - i - 1;
            for (int j = 0; j < a; j++) {
                System.out.print(" ");
            }

            int b = i + 1;
            int c = b * 2 - 1;
            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }

            if (n > 1) {
                System.out.println();
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            int a = n - i - 1;
            for (int j = 0; j < a; j++) {
                System.out.print(" ");
            }

            int b = i + 1;
            int c = b * 2 - 1;
            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }

            if (i > 0) {
                System.out.println();
            }
        }

        scan.close();
    }
}
