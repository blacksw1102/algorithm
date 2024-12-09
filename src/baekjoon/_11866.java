package baekjoon;

import java.util.*;

public class _11866 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] values = scan.nextLine().split(" ");
        int n = Integer.parseInt(values[0]);
        int step = Integer.parseInt(values[1]) - 1;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> resultQueue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < step; i++) {
                queue.offer(queue.poll());
            }
            resultQueue.offer(queue.poll());
        }

        System.out.println(resultQueue.toString().replace("[", "<").replace("]", ">"));
    }
}
