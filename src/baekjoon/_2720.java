package baekjoon;

import java.util.Scanner;

public class _2720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] units = new int[]{25, 10, 5, 1};
        int count = scan.nextInt();

        // 거스름돈 입력
        int[] changes = new int[count];
        for (int i = 0; i < count; i++) {
            changes[i] = scan.nextInt();
        }

        // 동전 교환 처리
        int[][] unitCounts = new int[count][units.length];
        for (int i = 0; i < changes.length; i++) {
            for (int j = 0; j < units.length; j++) {
                unitCounts[i][j] = (int) (changes[i] / units[j]);
                changes[i] -= units[j] * unitCounts[i][j];
            }
        }

        // 동전 교환 결과 출력
        for (int i = 0; i < unitCounts.length; i++) {
            for (int j = 0; j < unitCounts[i].length; j++) {
                System.out.print(unitCounts[i][j]);
                if (j + 1 < unitCounts[i].length) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
