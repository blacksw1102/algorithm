package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _4948 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int value = Integer.parseInt(scan.nextLine());
            if (value == 0) {
                break;
            }

            int from = value + 1;
            int to = value * 2;
            int count = 0;
            for (int i = from; i <= to; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }

            bw.write(count + "\n");
        }

        bw.flush();
    }

    public static boolean isPrime(int value) {
        boolean isPrime = value >= 2;

        int from = 2;
        int to = (int) Math.sqrt(value);
        for (int i = from; i <= to; i++) {
            if (value % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

}
