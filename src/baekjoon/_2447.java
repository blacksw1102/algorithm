package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2447 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[n][n];

        // when
        initStar(0, 0, 1, n, arr);
        String result = getStar(arr);

        // then
        System.out.println(result);
    }

    public static void initStar(int rowIdx, int colIdx, int nth, int n, boolean[][] arr) {
        // given

        // when
        if (nth == 5) {
            int toRowIdx = rowIdx + n;
            int toColIdx = colIdx + n;
            for (int i = rowIdx; i < toRowIdx; i++) {
                for (int j = colIdx; j < toColIdx; j++) {
                    arr[i][j] = true;
                }
            }
        }

        if (n > 1) {
            n = n / 3;
            initStar(rowIdx + n * 0, colIdx + n * 0, 1, n, arr);
            initStar(rowIdx + n * 0, colIdx + n * 1, 2, n, arr);
            initStar(rowIdx + n * 0, colIdx + n * 2, 3, n, arr);
            initStar(rowIdx + n * 1, colIdx + n * 0, 4, n, arr);
            initStar(rowIdx + n * 1, colIdx + n * 1, 5, n, arr);
            initStar(rowIdx + n * 1, colIdx + n * 2, 6, n, arr);
            initStar(rowIdx + n * 2, colIdx + n * 0, 7, n, arr);
            initStar(rowIdx + n * 2, colIdx + n * 1, 8, n, arr);
            initStar(rowIdx + n * 2, colIdx + n * 2, 9, n, arr);
        }

        // then
    }

    public static String getStar(boolean[][] arr) {
        // given
        StringBuilder sb = new StringBuilder();

        // when
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sb.append(arr[i][j] ? " " : "*");
            }
            sb.append("\n");
        }

        // then
        return sb.toString();
    }

}
