package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11653 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 2;
        List<Integer> primeFactors = new ArrayList<>();

        // 소인수 분해
        while (m * m <= n) {
            if (n % m == 0) {
                primeFactors.add(m);
                n = n / m;
            } else {
                m++;
            }
        }
        if (n > 1) {
            primeFactors.add(n);
        }

        // 결과 출력
        for (int i = 0; i < primeFactors.size(); i++) {
            System.out.println(primeFactors.get(i));
        }
    }
}
