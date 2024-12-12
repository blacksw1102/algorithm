package baekjoon;

import java.io.*;
import java.util.*;

public class _20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        String[] values = br.readLine().split(" ");
        int n = Integer.parseInt(values[0]);
        int m = Integer.parseInt(values[1]);

        // 단어 카운팅
        for (int i = 0; i < n; i++) {
            String value = br.readLine();
            if (value.length() < m) {
                continue;
            }
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
                list.add(value);
            }
        }

        // 정렬
        list.sort((a, b) -> {
            if (map.get(a) > map.get(b)) {
                return -1;
            } else if (map.get(a) < map.get(b)) {
                return 1;
            }

            if (a.length() > b.length()) {
                return -1;
            } else if (a.length() < b.length()) {
                return 1;
            }

            return a.charAt(0) - b.charAt(0);
        });

        // 결과 출력
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
    }
}
