package baekjoon;

import java.util.*;

public class _14425 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 집합 문자열 초기화
        Set<String> sources = new HashSet<>();
        for (int i = 0; i < n; i++) {
            sources.add(scan.nextLine());
        }

        // 검사할 문자열 초기화
        List<String> targets = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            targets.add(scan.nextLine());
        }

        // 탐색
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (sources.contains(targets.get(i))) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);
    }

}
