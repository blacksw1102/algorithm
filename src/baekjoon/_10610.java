package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _10610 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("");
        Arrays.sort(strs, Comparator.reverseOrder());
        String str = String.join("", strs);

        boolean condition10 = strs[strs.length - 1].equals("0");
        boolean condition3 = Arrays.stream(strs).mapToInt(Integer::parseInt).sum() % 3 == 0;

        System.out.println(condition10 && condition3 ? str : "-1");
    }

}
