import java.util.Scanner;

public class baekjoon_5597 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[30];

        // 과제 제출
        for (int i = 0; i < arr.length - 2; i++) {
            int idx = scanner.nextInt() - 1;
            arr[idx] = 1;
        }

        // 과제 미제출자 출력
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println((i + 1));
            }
        }
    }
}
