import java.util.Scanner;

public class baekjoon_10813 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = "";

        line = scanner.nextLine();
        int n = Integer.parseInt(line.split(" ")[0]);
        int m = Integer.parseInt(line.split(" ")[1]);

        // 바구니 초기화
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // 공 바꾸기
        for (int i = 0; i <m; i++) {
            line = scanner.nextLine();
            int fromIdx = Integer.parseInt(line.split(" ")[0]) - 1;
            int toIdx = Integer.parseInt(line.split(" ")[1]) - 1;
            int temp = 0;
            temp = arr[fromIdx];
            arr[fromIdx] = arr[toIdx];
            arr[toIdx] = temp;
        }

        // 결과 출력
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            stringBuffer.append(arr[i] + " ");
        }
        System.out.println(stringBuffer.toString().trim());
        scanner.close();
    }
}
