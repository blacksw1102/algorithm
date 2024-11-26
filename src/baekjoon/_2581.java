package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2581 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int from = scan.nextInt();
        int to = scan.nextInt();

        // 소수 계산
        List<Integer> decimals = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            int from2 = 2;
            int to2 = i / 2;
            boolean isDecimal = i >= 2;
            while (isDecimal && from2 <= to2) {
                if (i % from2 == 0) {
                    isDecimal = false;
                }
                from2++;
            }
            if (isDecimal) {
                decimals.add(i);
            }
        }

        // 결과 출력
        if (!decimals.isEmpty()) {
            int sum = 0;
            for (int i = 0; i < decimals.size(); i++) {
                sum += decimals.get(i);
            }

            int min = decimals.get(0);
            for (int i = 1; i < decimals.size(); i++) {
                if (min > decimals.get(i)) {
                    min = decimals.get(i);
                }
            }

            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println("-1");
        }
    }
}
