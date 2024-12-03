package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _10816 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        // 카운팅
        int n = Integer.parseInt(scan.nextLine());
        String[] insertValues = scan.nextLine().split(" ");
        for (int i = 0; i < insertValues.length; i++) {
            if (map.containsKey(insertValues[i])) {
                map.put(insertValues[i], map.get(insertValues[i]) + 1);
            } else {
                map.put(insertValues[i], 1);
            }
        }

        // 출력
        int m = Integer.parseInt(scan.nextLine());
        String[] searchValues = scan.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < searchValues.length; i++) {
            if (map.containsKey(searchValues[i])) {
                sb.append(map.get(searchValues[i])).append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}