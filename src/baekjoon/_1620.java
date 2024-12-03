package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class _1620 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] values = scan.nextLine().split(" ");
        int n = Integer.parseInt(values[0]);
        int m = Integer.parseInt(values[1]);

        // 적재
        Map<Integer, String> numberIndexMap = new HashMap<>();
        Map<String, Integer> nameIndexMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = scan.nextLine();
            numberIndexMap.put(i, name);
            nameIndexMap.put(name, i);
        }

        // 탐색
        Pattern pattern = Pattern.compile("^-?\\d+$");
        for (int i = 0; i < m; i++) {
            String value = scan.nextLine();
            boolean matcher = pattern.matcher(value).matches();
            if (matcher) {
                int number = Integer.parseInt(value);
                System.out.println(numberIndexMap.get(number));
            } else {
                System.out.println(nameIndexMap.get(value));
            }
        }
    }
}
