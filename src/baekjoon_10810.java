import java.util.Scanner;

public class baekjoon_10810 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = "";

        line = scanner.nextLine();
        int basketCount = Integer.parseInt(line.split(" ")[0]);
        int tryCount = Integer.parseInt(line.split(" ")[1]);
        int[] basketArr = new int[basketCount];

        // 바구니에 공 넣기
        for (int i = 0; i < tryCount; i++) {
            line = scanner.nextLine();
            int fromIdx = Integer.parseInt(line.split(" ")[0]) - 1;
            int toIdx = Integer.parseInt(line.split(" ")[1]) - 1;
            int value = Integer.parseInt(line.split(" ")[2]);
            for (int j = fromIdx; j <= toIdx; j++) {
                basketArr[j] = value;
            }
        }

        // 결과
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < basketArr.length; i++) {
            stringBuffer.append(basketArr[i] + " ");
        }
        System.out.println(stringBuffer.toString().trim());
    }
}
