package baekjoon;

import java.util.*;

public class _3009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] points = new int[][] {
            {scan.nextInt(), scan.nextInt()},
            {scan.nextInt(), scan.nextInt()},
            {scan.nextInt(), scan.nextInt()}
        };

        // 네 번째 점 (x좌표) 찾기
        List<Integer> xSlot = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            Integer value = points[i][0];
            if (xSlot.contains(value)) {
                xSlot.remove(value);
            } else {
                xSlot.add(value);
            }
        }

        // 네 번째 점 (y좌표) 찾기
        List<Integer> ySlot = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            Integer value = points[i][1];
            if (ySlot.contains(value)) {
                ySlot.remove(value);
            } else {
                ySlot.add(value);
            }
        }

        // 결과 출력
        System.out.println(xSlot.get(0) + " " + ySlot.get(0));
    }
}
