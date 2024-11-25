package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2501 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nth = scan.nextInt();
        List<Integer> divisors = new ArrayList<>();

        // 약수 계산
        int from = 1;
        int to = n / 2;
        while (from <= to) {
            if (n % from == 0) {
                divisors.add(from);
            }
            from++;
        }
        divisors.add(n);

        // 결과 출력
        if (nth <= divisors.size()) {
            System.out.println(divisors.get(nth - 1));
        } else {
            System.out.println("0");
        }
    }
}
