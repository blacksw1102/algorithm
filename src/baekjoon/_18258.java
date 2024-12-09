package baekjoon;

import java.io.*;
import java.util.ArrayDeque;

public class _18258 {
    public static void main(String[] args) throws IOException {
        ArrayDeque<String> queue = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            String command = values[0];

            if (command.equals("push")) {
                queue.offer(values[1]);
            } else if (command.equals("pop")) {
                bw.write((queue.isEmpty() ? -1 : queue.poll()) + "\n");
            } else if (command.equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (command.equals("empty")) {
                bw.write((queue.isEmpty() ? 1 : 0) + "\n");
            } else if (command.equals("front")) {
                bw.write((queue.isEmpty() ? -1 : queue.peekFirst()) + "\n");
            } else if (command.equals("back")) {
                bw.write((queue.isEmpty() ? -1 : queue.peekLast()) + "\n");
            }
        }

        bw.flush();
    }
}
