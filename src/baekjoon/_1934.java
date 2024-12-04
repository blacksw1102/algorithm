package baekjoon;

import java.util.Scanner;

public class _1934 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] values = scan.nextLine().split(" ");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            int gcd = euclid(a, b);
            int lcm = a * b / gcd;
            System.out.println(lcm);
        }
    }

    public static int euclid(int a, int b) {
        int r = a;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
