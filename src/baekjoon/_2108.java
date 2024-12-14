package baekjoon;

import java.io.*;
import java.util.*;

/**
 * 문제 : 통계학
 * - 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
 * 1. 산술평균 : N개의 수들의 합을 N으로 나눈 값
 * 2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값
 * 4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 * - N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * - 첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다.
 * - 그 다음 N개의 줄에는 정수들이 주어진다.
 */
public class _2108 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // when
        List<Integer> values = inputValues(br);
        bw.write(average(values) + "\n");
        bw.write(center(values) + "\n");
        bw.write(getMaxCountValue( values) + "\n");
        bw.write(diff(values) + "\n");

        // then
        bw.flush();
    }

    public static List<Integer> inputValues(BufferedReader br) throws IOException {
        // given
        int n = Integer.parseInt(br.readLine());
        List<Integer> values = new ArrayList<>();

        // when
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            values.add(value);
        }
        Collections.sort(values);

        // then
        return values;
    }

    public static int average(List<Integer> values) {
        // given
        long sum = 0;
        float average;

        // when
        for (Integer value : values) {
            sum += value;
        }
        average = Math.round((float) sum / values.size());

        // then
        return (int) average;
    }

    public static int center(List<Integer> values) {
        return values.get(values.size() / 2);
    }

    public static int getMaxCountValue(List<Integer> values) {
        // given
        Map<Integer, Integer> counts = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>();
        int max = Integer.MIN_VALUE;

        // when
        for (Integer value : values) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }

        for (Integer value : counts.keySet()) {
            if (max < counts.get(value)) {
                max = counts.get(value);
                queue.clear();
                queue.add(value);
            } else if (max == counts.get(value)) {
                queue.add(value);
            }
        }

        if (queue.size() > 1) {
            queue.poll();
        }

        // then
        return queue.poll();
    }

    public static int diff(List<Integer> values) {
        return values.get(values.size() - 1) - values.get(0);
    }

}
