package baekjoon;

import java.util.Map;
import java.util.Scanner;

public class _25206 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final Map<String, Float> subjectRating = Map.of(
                "A+", 4.5f,
                "A0", 4.0f,
                "B+", 3.5f,
                "B0", 3.0f,
                "C+", 2.5f,
                "C0", 2.0f,
                "D+", 1.5f,
                "D0", 1.0f,
                "F", 0.0f
        );
        float creditTotal = 0.0f;
        float subjectRatingTotal = 0.0f;

        for (int i = 0; i < 20; i++) {
            String[] values = scan.nextLine().split(" ");
            if (!values[2].equals("P")) {
                subjectRatingTotal += subjectRating.get(values[2]) * Float.parseFloat(values[1]);
                creditTotal += Float.parseFloat(values[1]);
            }
        }

        System.out.format("%.6f", subjectRatingTotal / creditTotal);
    }
}
