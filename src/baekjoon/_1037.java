package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 문제 : 약수
 * - 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다.
 * - 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.

 * 입력
 * - 첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다.
 * - 둘째 줄에는 N의 진짜 약수가 주어진다. 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.

 * 노트
 * - 약수는 항상 쌍으로 존재한다.
 * ex) 2, 3, 4, 6, 9, 12, 18
 * => (2, 18), (3, 12), (4, 9), (6, 6)
 */
public class _1037 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // when
        List<Integer> list = inputValues(br);
        int result = getResult(list);

        // then
        System.out.println(result);
    }

    public static List<Integer> inputValues(BufferedReader br) throws IOException {
        // given
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // when
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        // then
        return list;
    }

    public static int getResult(List<Integer> list) {
        // when
        Collections.sort(list);
        int min = list.get(0);
        int max = list.get(list.size() - 1);

        // then
        return min * max;
    }

}
