package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        System.out.println(work(arr) ? "Nice" : "Sad");
    }

    public static boolean work(String[] arr) {
        int currentValue = 1;

        // 대기열 처리
        Stack<Integer> stack = new Stack<>();
        for (String str : arr) {
            while (!stack.isEmpty() && currentValue == stack.peek()) {
                stack.pop();
                currentValue++;
            }

            stack.add(Integer.parseInt(str));
        }

        // Stack 비우기
        while (!stack.isEmpty() && currentValue == stack.peek()) {
            stack.pop();
            currentValue++;
        }

        // 결과 처리
        return stack.isEmpty();
    }
}
