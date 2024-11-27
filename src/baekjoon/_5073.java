package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _5073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            StringTokenizer tokens = new StringTokenizer(input, " ");

            // 배열 초기화
            int[] values = new int[3];
            for (int i = 0; i < values.length; i++) {
                values[i] = Integer.parseInt(tokens.nextToken());
            }

            // 정렬
            Arrays.sort(values);

            // 처리
            if (values[0] == 0 && values[1] == 0 && values[2] == 0) {
                break;
            } else if (values[0] + values[1] <= values[2]) {
                System.out.println("Invalid");
            } else if (values[0] == values[1] && values[1] == values[2]) {
                System.out.println("Equilateral");
            } else if (values[0] == values[1] || values[1] == values[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
