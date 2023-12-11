import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class baekjoon_1152 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().trim().split(" ");

        int count = 0;
        for (int i = 0; i < line.length; i++) {
            if (!"".equals(line[i])) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
