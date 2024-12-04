package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _11478 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();

        // 부붐 문자열(중복 x) 포집
        Set<String> set = new HashSet<>();
        for (int i = 1; i <= value.length(); i++) {
            for (int j = 0; j + i <= value.length(); j++) {
                String partValue = value.substring(j, j + i);
                set.add(partValue);
            }
        }

        // 부분 문자열(중복 x) 개수 출력
        System.out.println(set.size());
    }
}
