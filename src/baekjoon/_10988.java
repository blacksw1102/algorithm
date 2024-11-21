package baekjoon;

import java.util.Scanner;

public class _10988 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] a = scan.nextLine().toCharArray();

        int b = 0;
        int c = a.length;
        int d = c / 2 + 1;
        boolean e = true;
        for (int i = 0; i < d; i++) {
            if (a[i] != a[c - i - 1]) {
                e = false;
                break;
            }
        }

        System.out.println((e) ? "1" : "0");

        scan.close();
    }
}