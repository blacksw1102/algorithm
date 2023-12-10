import java.util.Scanner;

public class baekjoon_27323 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if ("0 0".equals(line)) {
                break;
            }

            int n1 = Integer.parseInt(line.split(" ")[0]);
            int n2 = Integer.parseInt(line.split(" ")[1]);
            if (n2 % n1 == 0) {
                System.out.println("factor");
            } else if (n1 % n2 == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
        scanner.close();
    }
}
