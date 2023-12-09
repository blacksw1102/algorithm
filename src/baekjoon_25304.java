import java.util.Scanner;

public class baekjoon_25304 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long totalPrice = scanner.nextLong();
        long totalGoodsCount = scanner.nextLong();
        scanner.nextLine();

        // 재계산
        long reTotalPrice = 0;
        for (int i = 0; i < totalGoodsCount; i++) {
            String line = scanner.nextLine();
            long goodsPrice = Long.parseLong(line.split(" ")[0]);
            long goodsCount = Long.parseLong(line.split(" ")[1]);
            reTotalPrice += goodsPrice * goodsCount;
        }

        // 계산 결과 비교
        if (reTotalPrice == totalPrice) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
