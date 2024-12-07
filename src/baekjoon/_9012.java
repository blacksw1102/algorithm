package baekjoon;

import java.io.*;

public class _9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split("");
            int count = 0;

            for (String value : values) {
                if (value.equals("(")) {
                    count++;
                }
                if (value.equals(")")) {
                    count--;
                }
                if (count < 0) {
                    break;
                }
            }

            if (count != 0) {
                bw.write("NO\n");
            } else {
                bw.write("YES\n");
            }
        }

        bw.flush();
    }
}
