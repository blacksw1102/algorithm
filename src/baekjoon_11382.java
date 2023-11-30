import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_11382 {
    public static void main(String[] args) {

        String text = new Scanner(System.in).nextLine();
        long result = Arrays.stream(text.split(" "))
                .map(v -> Long.parseLong(v))
                .reduce(0L, (a, b) -> a + b);
        System.out.println(result);

    }
}