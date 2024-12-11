package baekjoon;

import java.util.*;

public class _2346 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Map<String, Object>> queue = new ArrayDeque<>();
        int n = Integer.parseInt(scan.nextLine());

        String[] values = scan.nextLine().split(" ");
        for (int i = 0; i < values.length; i++) {
            Map<String,Object> balloon = new LinkedHashMap<>();
            balloon.put("idx", i + 1);
            balloon.put("paper", Integer.parseInt(values[i]));
            queue.add(balloon);
        }

        int step = 1;
        while (!queue.isEmpty()) {
            Map<String, Object> ballonMap = (step > 0) ? queue.pollFirst() : queue.pollLast();
            step = (step > 0) ? step - 1 : step + 1;

            if (step > 0) {
                queue.offerLast(ballonMap);
            } else if (step < 0) {
                queue.offerFirst(ballonMap);
            } else {
                step = Integer.parseInt(String.valueOf(ballonMap.get("paper")));
                sb.append(Integer.parseInt(String.valueOf(ballonMap.get("idx")))).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }

}
