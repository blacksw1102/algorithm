package baekjoon;

import java.util.Scanner;

public class _10101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angle1 = scan.nextInt();
        int angle2 = scan.nextInt();
        int angle3 = scan.nextInt();

        if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println("Equilateral");
        } else if (angle1 + angle2 + angle3 == 180 && (angle1 == angle2 || angle2 == angle3 || angle3 == angle1)) {
            System.out.println("Isosceles");
        } else if (angle1 + angle2 + angle3 == 180 && (angle1 != angle2 && angle2 != angle3 && angle3 != angle1)) {
            System.out.println("Scalene");
        } else if (angle1 + angle2 + angle3 != 180) {
            System.out.println("Error");
        }
    }
}
