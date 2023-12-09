import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_10807 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valuesLen = scanner.nextInt();
        scanner.nextLine();
        String[] values = scanner.nextLine().split(" ");
        int target = scanner.nextInt();
        int count = 0;

        for (String v : values) {
            if (Integer.parseInt(v) == target) {
                count++;
            }
        }

        // 결과
        System.out.println(count);
    }
}
