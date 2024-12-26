package baekjoon;

import java.io.*;
import java.util.*;

/**
 * 1. 입력받는 자릿 수들로 구성 가능한 수들을 구해야 한다.
 * 2. 1번에서 구한 수들 중 30의 배수가 되는 가장 큰 수를 구해야 한다.
 */
public class _10610 {
    static String[] valueArr;
    static String[] trackArr;
    static boolean[] visitedArr;
    static Set<Integer> subSet;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        valueArr = br.readLine().split("");
        trackArr = new String[valueArr.length];
        visitedArr = new boolean[valueArr.length];
        subSet = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 1; i <= valueArr.length; i++) {
            initSubSet(i, 0);
        }

        int result = getResult();

        System.out.println(result);
    }

    public static int getResult() {
        int result = -1;

        for (Integer value : subSet) {
            if (value % 30 == 0) {
                result = value;
                break;
            }
        }

        return result;
    }

    public static void initSubSet(int length, int depth) {
        if (depth < length) {
            for (int i = 0; i < valueArr.length; i++) {
                if (!visitedArr[i]) {
                    visitedArr[i] = true;
                    trackArr[depth] = valueArr[i];
                    initSubSet(length, depth + 1);
                    visitedArr[i] = false;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(trackArr[i]);
            }
            subSet.add(Integer.parseInt(sb.toString()));
        }
    }

}
