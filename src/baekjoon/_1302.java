package baekjoon;

import java.io.*;
import java.util.*;

public class _1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        String maxKey = "";
        int maxValue = Integer.MIN_VALUE;
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            boolean condition1 = maxValue < entry.getValue();
            boolean condition2 = maxValue == entry.getValue() && maxKey.compareTo(entry.getKey()) > 0;
            if (condition1 || condition2) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        System.out.println(maxKey);
    }
}
