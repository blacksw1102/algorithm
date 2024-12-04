package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1269 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] values = scan.nextLine().split(" ");
        int n = Integer.parseInt(values[0]);
        int m = Integer.parseInt(values[1]);

        // 집합 a, b 초기화
        Set<Integer> aSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            aSet.add(scan.nextInt());
        }

        Set<Integer> bSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            bSet.add(scan.nextInt());
        }

        // 두 집합에 공통 원소 추출
        Set<Integer> commonSet = new HashSet<>();
        for (Integer value : aSet) {
            if (bSet.contains(value)) {
                commonSet.add(value);
            }
        }

        // 두 집합에 공통 원소 제거
        for (Integer value : commonSet) {
            aSet.remove(value);
            bSet.remove(value);
        }

        // 결과 출력 (대칭 차집합 원소 수)
        System.out.println(aSet.size() + bSet.size());
    }
}
