package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 문제
 *
 * - 무지개 댄스를 추지 않고 있던 사람이 무지개 댄스를 추고 있던 사람을 만나게 된다면, 만난 시점 이후로 무지개 댄스를 추게 된다.
 * - 기록이 시작되기 이전 무지개 댄스를 추고 있는 사람은 "ChongChong"이 뿐이라고 할 때
 * - 마지막 기록 이후 무지개 댄스를 추는 사람이 몇 명인지 구해보자
 */
public class _26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>(List.of("ChongChong"));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            String value1 = values[0];
            String value2 = values[1];
            if (set.contains(value1) || set.contains(value2)) {
                set.add(value1);
                set.add(value2);
            }
        }

        System.out.println(set.size());
    }
}
