package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        int base = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        while (decimal >= base) {
            list.add(0, decimal % base);
            decimal /= base;
        }
        list.add(0, decimal);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (base > 10 && value >= 10) {
                builder.append((char) (value - 10 + 'A'));
            } else {
                builder.append(value);
            }
        }
        System.out.println(builder);
    }
}
