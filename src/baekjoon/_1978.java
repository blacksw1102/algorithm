package baekjoon;

import java.util.Scanner;

public class _1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int decimalCount = 0;

        // 소수 계산
        for (int i = 0; i < count; i++) {
            int n = scan.nextInt();
            int from = 2;
            int to = n / 2;

            boolean isDecimal = n >= 2;
            while (from <= to) {
                if (n % from == 0) {
                    isDecimal = false;
                    break;
                }
                from++;
            }

            if (isDecimal) {
                decimalCount++;
            }
        }

        // 결과 출력
        System.out.println(decimalCount);
    }
}
