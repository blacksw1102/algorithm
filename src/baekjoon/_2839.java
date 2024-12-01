package baekjoon;

import java.util.Scanner;

/**
 * - 설탕을 정확하게 "N킬로그램"을 배달해야 한다.
 * - 설탕공장에서 만드는 "설탕은 봉지에 담겨져 있다."
 * - 봉지는 "3킬로그램 봉지"와 "5킬로그램 봉지"가 있다.
 * - "최대한 적은 봉지"를 들고 가려고 한다.
 * - 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
 */
public class _2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kg = scan.nextInt();
        int minCount = -1;
        for (int i = 0; kg >= i * 5; i++) {
            for (int j = 0; kg >= j * 3; j++) {
                int temp = kg;
                int count = 0;
                if (i > 0) {
                    count += i;
                    temp -= i * 5;
                }
                if (j > 0) {
                    count += j;
                    temp -= j * 3;
                }
                if (temp == 0 && (minCount == -1 || minCount > count)) {
                    minCount = count;
                }
            }
        }

        System.out.println(minCount);
    }

}
