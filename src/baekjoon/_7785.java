package baekjoon;

import java.util.*;

public class _7785 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Set<String> sets = new TreeSet<>(Collections.reverseOrder());

        // 출입 처리
        for (int i = 0; i < n; i++) {
            String[] values = scan.nextLine().split(" ");
            String name = values[0];
            String state = values[1];
            if ("enter".equals(state)) {
                sets.add(name);
            } else if ("leave".equals(state)) {
                sets.remove(name);
            }
        }

        // 남은 사람 출력
        for (String name : sets) {
            System.out.println(name);
        }
    }
}
