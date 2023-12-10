import java.util.Scanner;

public class baekjoon_2743 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            String str = scanner.nextLine();
            System.out.println(String.format("%c%c", str.charAt(0), str.charAt(str.length() - 1)));
        }
        scanner.close();
    }
}
