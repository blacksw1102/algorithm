package baekjoon;

import java.util.Scanner;

public class _13241 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] values = scan.nextLine().split(" ");
        long a = Integer.parseInt(values[0]);
        long b = Integer.parseInt(values[1]);
        long gcd = euclid(a, b);
        long lcm = a * b / gcd;
        System.out.println(lcm);
    }

    public static long euclid(long a, long b) {
        long r = a;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
