package baekjoon;

import java.util.Scanner;

public class _1018 {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final String[] values = scan.nextLine().split(" ");
        final int n = Integer.parseInt(values[0]);
        final int m = Integer.parseInt(values[1]);
        final char[][] board = new char[n][m];

        // 보드 초기화
        for (char[] row : board) {
            char[] chars = scan.nextLine().toCharArray();
            System.arraycopy(chars, 0, row, 0, chars.length);
        }

        // 전체 보드에서 8x8 단위 별로 틀린 색깔 찾기 수행
        int minCount = 64;
        for (int fromYIdx = 0; fromYIdx <= n - 8; fromYIdx++) {
            for (int fromXIdx = 0; fromXIdx <= m - 8; fromXIdx++) {
                int count = countWrongColor(fromYIdx, fromXIdx, board);
                minCount = Math.min(minCount, count);
            }
        }

        System.out.println(minCount);
    }

    public static int countWrongColor(int fromYIdx, int fromXIdx, char[][] board) {
        final String[] chess = {"BWBWBWBW", "WBWBWBWB"};

        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int y = fromYIdx + i;
                int x = fromXIdx + j;
                if (board[y][x] != chess[i % 2].charAt(j)) {
                    count++;
                }
            }
        }
        count = Math.min(count, 64 - count);

        return count;
    }
}
