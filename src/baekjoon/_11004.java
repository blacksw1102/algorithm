package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println(arr[k - 1]);
    }

    public static void quickSort(int[] arr, int startIdx, int endIdx) {
        if (startIdx < endIdx) {
            int pivotIdx = partition(arr, startIdx, endIdx);
            quickSort(arr, startIdx, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, endIdx);
        }
    }

    public static int partition(int[] arr, int startIdx, int endIdx) {
        int lowIdx = startIdx + 1;
        int highIdx = endIdx;
        int pivotIdx = (startIdx + endIdx) / 2;
        int pivot = arr[pivotIdx];

        swap(arr, startIdx, pivotIdx);

        while (lowIdx <= highIdx) {
            while (highIdx >= startIdx + 1  && pivot < arr[highIdx]) {
                highIdx--;
            }
            while (lowIdx <= endIdx && pivot > arr[lowIdx] ) {
                lowIdx++;
            }
            if (lowIdx <= highIdx) {
                swap(arr, lowIdx++, highIdx--);
            }
        }

        swap(arr, startIdx, highIdx);

        return highIdx;
    }

    public static void swap(int[] arr, int aIdx, int bIdx) {
        int temp = arr[aIdx];
        arr[aIdx] = arr[bIdx];
        arr[bIdx] = temp;
    }

}
