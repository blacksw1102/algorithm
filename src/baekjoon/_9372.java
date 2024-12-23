package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class _9372 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tryCount = scan.nextInt();

        for (int i = 0; i < tryCount; i++) {
            int countryCount = scan.nextInt();
            int plainCount = scan.nextInt();
            List<List<Integer>> adjacencyList = new ArrayList<>(countryCount);

            // 인접 리스트 초기화
            for (int j = 0; j < countryCount; j++) {
                adjacencyList.add(new LinkedList<>());
            }

            for (int j = 0; j < plainCount; j++) {
                int from = scan.nextInt() - 1;
                int to = scan.nextInt() - 1;
                adjacencyList.get(from).add(to);
                adjacencyList.get(to).add(from);
            }

            // 출력
            for (int j = 0; j < plainCount; j++) {
                System.out.print((j + 1) + " : ");
                for (int k = 0; k < adjacencyList.get(j).size(); k++) {
                    System.out.print((adjacencyList.get(j).get(k) + 1) + " ");
                }
                System.out.println();
            }

            // 최소 방문 수 계산
            int minMovedCount = -1;
            for (int j = 0; j < adjacencyList.size(); j++) {
                int tempMovedCount = recursive(-1, j, adjacencyList, new boolean[countryCount], 0);
                if (minMovedCount == -1 || minMovedCount > tempMovedCount) {
                    minMovedCount = tempMovedCount;
                }
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }

            System.out.println("===========================");
            System.out.println("minMovedCount : " + minMovedCount);
            System.out.println("===========================");
        }

    }

    public static int recursive(int prev, int root, List<List<Integer>> adjacencyList, boolean[] visited, int movedCount) {
        // 방문 체크
        visited[root] = true;

        // 전부 방문 했으면 최종 방문 카운트 리턴
        boolean isAllVisited = true;
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("prev : " + ((prev == -1) ? "-1" : (prev + 1)));
        System.out.println("root : " + (root + 1));
        System.out.println("movedCount : " + movedCount);
        for (int i = 0; i < visited.length; i++) {
            System.out.print((i + 1) + " : " + visited[i] + " ");
            if (!visited[i]) {
                isAllVisited = false;
                break;
            }
        }
        System.out.println();

        if (isAllVisited) {
            System.out.println("complete");
            return movedCount;
        } else {
            movedCount++;
        }

        // 재귀
        List<Integer> nextRoots = adjacencyList.get(root);
        int minMovedCount = -1;
        boolean canVisited = false;
        for (Integer nextRoot : nextRoots) {
            if (!visited[nextRoot]) {
                canVisited = true;
                int tempMovedCount = recursive(root, nextRoot, adjacencyList, visited.clone(), movedCount);
                if (minMovedCount == -1 || minMovedCount > tempMovedCount) {
                    minMovedCount = tempMovedCount;
                }
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("prev : " + ((prev == -1) ? "-1" : (prev + 1)));
                System.out.println("root : " + (root + 1));
                System.out.println("tempMovedCount : " + tempMovedCount);
                System.out.println("minMovedCount : " + minMovedCount);
            }
        }

        if (!canVisited) {
            minMovedCount = movedCount;
        }

        return minMovedCount;
    }
}
