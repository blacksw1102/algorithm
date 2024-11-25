package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _9506 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();

            // -1을 입력받으면 종료
            if (n == -1) {
                break;
            }

            // 약수 구하기
            List<Integer> divisors = new ArrayList<>();
            int from  = 1;
            int to = n / 2;
            while (from <= to) {
                if (n % from == 0) {
                    divisors.add(from);
                }
                from++;
            }

            // 완전수 여부 검사
            int sum = 0;
            for (int i = 0; i < divisors.size(); i++) {
                sum += divisors.get(i);
            }
            boolean isPerfect = sum == n;

            // 결과 출력
            if (isPerfect) {
                System.out.print(n + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    System.out.print(divisors.get(i));
                    if (i + 1 < divisors.size()) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
