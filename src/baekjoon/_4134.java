package baekjoon;

import java.util.Scanner;

public class _4134 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            long value = Long.parseLong(scan.nextLine());
            boolean isEnd = false;

            while (!isEnd) {
                if (isDecimal(value)) {
                    isEnd = true;
                    System.out.println(value);
                } else {
                    value++;
                }
            }
        }
    }

    public static boolean isDecimal(long value) {
        boolean isDecimal = true;
        int from = 2;
        int to = (int) Math.sqrt(value);

        if (value < 2) {
            isDecimal = false;
        }

        for (int j = from; isDecimal && j <= to; j++) {
            if (value % j == 0) {
                isDecimal = false;
                break;
            }
        }
        return isDecimal;
    }

}
