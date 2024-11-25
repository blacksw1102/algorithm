package baekjoon;

import java.util.Scanner;

/**
 * 1번째 max 방 : 1 (+6)
 * 2번째 max 방 : 7 (+12)
 * 3번째 max 방 : 19 (+18)
 * 4번째 max 방 : 37 (+24)
 * 5번째 max 방 : 61
 */
public class _2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roomNo = scan.nextInt();
        int currentRoomNo = 1;
        int passCount = 1;

        while (currentRoomNo < roomNo) {
            currentRoomNo += 6 * passCount;
            passCount += 1;
        }

        System.out.println(passCount);
    }
}
