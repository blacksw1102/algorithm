package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

/**
 * 문제 :알고리즘 수업 - 병합 정렬 1
 * - 오늘도 서준이는 병합 정렬 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
 * - N개의 서로 다른 양의 정수가 저장된 배열 A가 있다. 병합 정렬로 배열 A를 오름차순 정렬할 경우 배열 A에 K 번째 저장되는 수를 구해서 우리 서준이를 도와주자.
 *
 * 입력
 * - 첫째 줄에 배열 A의 크기 N(5 <= N <= 500,000), 저장 횟수 K(1 <= K <= 10^8)가 주어진다.
 * - 다음 줄에 서로 다른 배열 A의 원소 A1, A2, ..., AN이 주어진다. (1 <= Ai <= 109)
 *
 * 출력
 * - 배열 A에 K 번째 저장 되는 수를 출력한다. 저장 횟수가 K 보다 작으면 -1을 출력한다.
 */
public class _24060 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> savedList = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = initArr(n, br);

        // when
        mergeSort(arr, 0, arr.length - 1, savedList);
        bw.write(String.valueOf((savedList.size() >= k) ? savedList.get(k - 1) : -1));

        // then
        bw.flush();
    }

    public static int[] initArr(int n, BufferedReader br) throws IOException {
        // given
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        // when
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            arr[i] = value;
        }

        // then
        return arr;
    }

    public static void mergeSort(int[] arr, int leftIdx, int rightIdx, List<Integer> savedList) {
        // given

        // when
        if (leftIdx < rightIdx) {
            int centerIdx = (leftIdx + rightIdx) / 2;
            mergeSort(arr, leftIdx, centerIdx, savedList);
            mergeSort(arr, centerIdx + 1, rightIdx, savedList);
            merge(arr, leftIdx, centerIdx, rightIdx, savedList);
        }

        // then
    }

    public static void merge(int[] arr, int leftIdx, int centerIdx, int rightIdx, List<Integer> savedList) {
        // given
        int i = leftIdx;
        int j = centerIdx + 1;
        int t = 0;
        int[] tmp = new int[rightIdx - leftIdx + 1];

        // when
        while (i <= centerIdx && j <= rightIdx) {
            int value = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
            tmp[t++] = value;
            savedList.add(value);
        }

        while (i <= centerIdx) {
            int value = arr[i++];
            tmp[t++] = value;
            savedList.add(value);
        }

        while (j <= rightIdx) {
            int value = arr[j++];
            tmp[t++] = value;
            savedList.add(value);
        }

        for (i = leftIdx, t = 0; i <= rightIdx; i++, t++) {
            arr[i] = tmp[t];
        }

        // then
    }
}
