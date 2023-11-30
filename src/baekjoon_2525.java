import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_2525 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text1 = scan.nextLine();
        String[] values = text1.split(" ");
        int hour = Integer.parseInt(values[0]);
        int min = Integer.parseInt(values[1]);

        String text2 = scan.nextLine();
        int min2 = Integer.parseInt(text2);

        hour = (hour + (min + min2) / 60) % 24;
        min = (min + min2) % 60;
        System.out.println(hour + " " + min);

    }
}