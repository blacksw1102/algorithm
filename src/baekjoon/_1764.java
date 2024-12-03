package baekjoon;

import java.util.*;

public class _1764 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] values = scan.nextLine().split(" ");
        int n = Integer.parseInt(values[0]);
        int m = Integer.parseInt(values[1]);

        // case1 체크
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String value = scan.nextLine();
            set.add(value);
        }

        // case2 체크
        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String value = scan.nextLine();
            if (set.contains(value)) {
                list.add(value);
            }
        }

        // 사전 순 정렬
        Collections.sort(list);

        // case1 && case2인 사례 출력
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
