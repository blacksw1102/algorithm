import java.util.Scanner;

public class baekjoon_27866 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] chars = scanner.nextLine().split("");
        int idx = scanner.nextInt() - 1;

        System.out.println(chars[idx]);
        scanner.close();
    }
}
