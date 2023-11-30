import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class baekjoon_2480 {
    public static void main(String[] args) {

        String text = new Scanner(System.in).nextLine();
        List<Integer> values = Arrays.stream(text.split(" "))
                .map(v -> Integer.parseInt(v))
                .collect(Collectors.toList());
        // System.out.println(values);

        List<Integer> rooms = Arrays.asList(0, 0, 0, 0, 0, 0, 0);
        values.stream().forEach(v -> rooms.set(v, rooms.get(v) + 1));
        // System.out.println(rooms);

        int maxNumber = 0;
        int sameNumber = 0;
        int sameCount = 0;
        for (int i=1; i<rooms.size(); i++) {
            if (sameCount < rooms.get(i)) {
                sameNumber = i;
                sameCount = rooms.get(i);
            }
            if (rooms.get(i) > 0 && maxNumber < i) {
                maxNumber = i;
            }
        }
        // System.out.println(String.format("maxNumber: %d, sameNumber: %d, sameCount: %d", maxNumber, sameNumber, sameCount));

        int result = 0;
        if (sameCount == 3) {
            result = sameNumber = 10000 + sameNumber * 1000;
        } else if (sameCount == 2) {
            result = 1000 + sameNumber * 100;
        } else {
            result = maxNumber * 100;
        }
        System.out.println(result);
    }
}