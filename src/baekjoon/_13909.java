package baekjoon;

import java.util.Scanner;

public class _13909 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long to = Integer.parseInt(scan.nextLine());
        long from = 1;
        long addValue = 3;
        long count = 0;

        while (from <= to) {
            count++;
            from += addValue;
            addValue += 2;
        }

        System.out.println(count);
    }
}
