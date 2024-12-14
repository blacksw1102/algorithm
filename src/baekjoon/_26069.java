package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 문제 : 붙임성 좋은 총총이
 * - 총총이는 자신의 묘기인 무지개 댄스를 선보여, 총총이의 댄스를 한번 보게 된 사람은 모두 따라 하게 돼버린다.
 * - 사람들이 만난 기록이 시간 순서대로 N개 주어진다.
 * - 무지개 댄스를 추지 않고 있던 사람이 무지개 댄스를 추고 있던 사람을 만나게 된다면, 만난 시점 이후로 무지개 댄스를 추게 된다.
 * - 기록이 시작되기 이전 무지개 댄스를 추고 있는 사람은 총총이 뿐이라고 할 때, 마지막 기록 이후 무지개 댄스를 추는 사람이 몇 명인지 구해보자!

 * 입력
 * - 첫번째 줄에는 사람들이 만난 기록의 수 N이 주어진다.
 * - 두번째 줄부터 N개의 줄에 걸쳐 사람들이 만난 기록이 주어진다.
 * - 총총이의 이름은 ChongChong으로 주어지며, 기록에서 1회 이상 주어진다.
 * - 동명이인은 없으며, 사람의 이름은 대소문자를 구분한다.
 */
public class _26069 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // when
        List<String[]> list = inputList(br);
        int count = countDancingPeople(list);

        // then
        System.out.println(count);
    }

    public static List<String[]> inputList(BufferedReader br) throws IOException {
        // given
        List<String[]> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        // when
        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            list.add(values);
        }

        // then
        return list;
    }

    public static int countDancingPeople(List<String[]> list) {
        // given
        Set<String> set = new HashSet<>(List.of("ChongChong"));

        // when
        for (String[] values : list) {
            String value1 = values[0];
            String value2 = values[1];
            if (set.contains(value1) || set.contains(value2)) {
                set.add(value1);
                set.add(value2);
            }
        }

        // then
        return set.size();
    }

}
