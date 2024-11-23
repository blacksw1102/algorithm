package baekjoon;

import java.util.Scanner;

public class _2941 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] croatiaAlphabets = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String input = scan.nextLine();
        int alphabetCount = 0;

        // 특정 크로아티아 문자 개수 누적
        for (String alphabet : croatiaAlphabets) {
            while (input.contains(alphabet)) {
                alphabetCount++;
                input = input.replaceFirst(alphabet, "/");
            }
        }

        // 작업 중 사용한 분리용 문자 제거
        input = input.replaceAll("/", "");

        // 남아 있는 일반 크로아티아 문자 개수 누적
        if (!input.isEmpty()) {
            alphabetCount += input.split("").length;
        }

        System.out.println(alphabetCount);
    }
}
