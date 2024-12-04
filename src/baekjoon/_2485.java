package baekjoon;

import java.util.*;

public class _2485 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());

        // 값 초기화
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(Integer.parseInt(scan.nextLine()));
        }

        // 정렬
        Collections.sort(list);

        // 지점간 최대 간격 계산
        int maxDistance = -1;
        for (int i = 1; i < size; i++) {
            int distance = list.get(i) - list.get(i - 1);
            if (maxDistance == -1) {
                maxDistance = distance;
            } else {
                maxDistance = euclid(maxDistance ,distance);
            }
        }

        // 새로 심어야 하는 가로수 수 계산
        int count = 0;
        // 기준 지점 다음으로 최종점까지 존재해야하는 가로수 수
        count = (list.get(list.size() - 1) - list.get(0)) / maxDistance;
        // 이미 심은 가로수 수 차감
        count = count - list.size() + 1;

        // 출력
        System.out.println(count);
    }

    public static int euclid(int a, int b) {
        int r = a;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
