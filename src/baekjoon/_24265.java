package baekjoon;

import java.util.Scanner;

/**
 * (n - 1) + (n - 2) + ... + 1 => 등차수열의 합
 * = (1 + (n - 1)) / 2 * (n - 1)
 * = n / 2 * (n - 1)
 * = n * (n - 1) / 2
 */
public class _24265 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}