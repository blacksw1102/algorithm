package baekjoon;

import java.io.*;
import java.util.Stack;

/**
 * 문제 : 스택 2
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 1. X: 정수 X를 스택에 넣는다. (1 <= X <= 100,000)
 * 2. 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
 * 3. 스택에 들어있는 정수의 개수를 출력한다.
 * 4. 스택이 비어있으면 1, 아니면 0을 출력한다.
 * 5. 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 *
 * 입력
 * 첫째 줄에 명령의 수 N이 주어진다. (1 <= N <= 1,000,000)
 * 둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.
 * 출력을 요구하는 명령은 하나 이상 주어진다.
 */
public class _28278 {
    public static void main(String[] args) throws IOException {
        // given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        // when
        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            int command = Integer.parseInt(values[0]);
            int value = (values.length == 2) ? Integer.parseInt(values[1]) : -1;

            Object result = processCommand(command, value, stack);

            if (command != 1) {
                bw.write(String.valueOf(result));
                bw.newLine();
            }
        }

        // then
        bw.flush();
    }

    public static Object processCommand(int command, int value, Stack<Integer> stack) {
        // given
        Object result = null;

        // when
        if (command == 1) {
            stack.push(value);
        } else if (command == 2) {
            result = (stack.isEmpty()) ? -1 : stack.pop();
        } else if (command == 3) {
            result = stack.size();
        } else if (command == 4) {
            result = (stack.isEmpty()) ? 1 : 0;
        } else if (command == 5) {
            result = (stack.isEmpty()) ? -1 : stack.peek();
        }

        // then
        return result;
    }
}