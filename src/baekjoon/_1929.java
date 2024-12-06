package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1929 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine());
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = from; i <= to; i++) {
            if (isPrime(i)) {
                bw.write(i + "\n");
            }
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
