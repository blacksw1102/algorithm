package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _2217 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int ropeCount;
    static Integer[] ropeWeightArr;
    static int maxEnableWeight;

    public static void main(String[] args) throws IOException {
        // when
        ropeCount = Integer.parseInt(br.readLine());
        ropeWeightArr = getRopeWeightArr();
        maxEnableWeight = getMaxWeight();

        // then
        System.out.println(maxEnableWeight);
    }

    public static int getMaxWeight() {
        // given
        int maxEnableWeight = Integer.MIN_VALUE;

        // when
        for (int i = 1; i <= ropeCount; i++) {
            int enableWeight = ropeWeightArr[i - 1] * i;
            maxEnableWeight = Math.max(maxEnableWeight, enableWeight);
        }

        // then
        return maxEnableWeight;
    }

    public static Integer[] getRopeWeightArr() throws IOException {
        // given
        Integer[] arr = new Integer[ropeCount];

        // when
        for (int i = 0; i < arr.length; i++) {
            int value = Integer.parseInt(br.readLine());
            arr[i] = value;
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        // then
        return arr;
    }

}
