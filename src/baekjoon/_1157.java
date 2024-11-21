package baekjoon;

import java.util.Scanner;

public class _1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] a = scan.nextLine().toLowerCase().toCharArray();

        int[] b = new int[26];
        for (int i = 0; i <a.length; i++) {
            b[a[i] - 97]++;
        }

        int c = 0;
        boolean d = false;
        for (int i = 1; i < b.length; i++) {
            if (b[c] < b[i]) {
                c = i;
                d = false;
            } else if (b[c] == b[i]) {
                d = true;
            }
        }

        System.out.println((d) ? "?" : (char)(65 + c));

        scan.close();
    }
}
