package baekjoon;

import java.io.*;
import java.util.ArrayDeque;

/**
 * 덱을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *
 * 명령은 총 여덟 가지이다.
 * 1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
 * 2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
 * 3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
 * 4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
 * 5: 덱에 들어있는 정수의 개수를 출력한다.
 * 6: 덱이 비어있으면 1, 아니면 0을 출력한다.
 * 7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 * 8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */
public class _28279 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            String command = values[0];

            if (command.equals("1")) {
                int value = Integer.parseInt(values[1]);
                queue.offerFirst(value);
            } else if (command.equals("2")) {
                int value = Integer.parseInt(values[1]);
                queue.offerLast(value);
            } else if (command.equals("3")) {
                int value = (!queue.isEmpty()) ? queue.removeFirst() :  -1;
                bw.write(value + "\n");
            } else if (command.equals("4")) {
                int value = (!queue.isEmpty()) ? queue.removeLast() : -1;
                bw.write(value + "\n");
            } else if (command.equals("5")) {
                int size = queue.size();
                bw.write(size + "\n");
            } else if (command.equals("6")) {
                int value = (!queue.isEmpty()) ? 0 : 1;
                bw.write(value + "\n");
            } else if (command.equals("7")) {
                int value = (!queue.isEmpty()) ? queue.peekFirst() : -1;
                bw.write(value + "\n");
            } else if (command.equals("8")) {
                int value = (!queue.isEmpty()) ? queue.peekLast() : -1;
                bw.write(value + "\n");
            }
        }

        bw.flush();
    }
}
