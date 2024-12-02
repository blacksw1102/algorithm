package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _10815 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 값 초기화
        int n = Integer.parseInt(scan.nextLine());
        String[] nArrStr = scan.nextLine().split(" ");
        int[] nArr = new int[nArrStr.length];
        for (int i = 0; i < nArrStr.length; i++) {
            nArr[i] = Integer.parseInt(nArrStr[i]);
        }

        int m = Integer.parseInt(scan.nextLine());
        String[] mArrStr = scan.nextLine().split(" ");
        int[] mArr = new int[mArrStr.length];
        for (int i = 0; i < mArrStr.length; i++) {
            mArr[i] = Integer.parseInt(mArrStr[i]);
        }

        // 이진 탐색을 위해 nArr 정렬
        Arrays.sort(nArr);

        // 이진 탐색
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mArr.length; i++) {
            int target = mArr[i];
            int start = 0;
            int end = nArr.length - 1;
            int searchResult = (binarySearch(nArr, target, start, end) != -1) ? 1 : 0;
            sb.append(searchResult).append(" ");
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        int targetAt = -1;

        while (start <= end) {
            int idx = (start + end) / 2;
            if (arr[idx] == target) {
                targetAt = idx;
                break;
            } else if (arr[idx] > target) {
                end = idx - 1;
            } else {
                start = idx + 1;
            }
        }

        return targetAt;
    }

}
