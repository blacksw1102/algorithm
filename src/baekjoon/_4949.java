package baekjoon;

import java.io.*;
import java.util.Stack;

public class _4949 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String value = br.readLine();
            if (!value.equals(".")) {
                bw.write(work(value) + "\n");
            } else {
                break;
            }
        }

        bw.flush();
    }

    public static String work(String str) {
        String[] values = str.split("");
        Stack<String> stack = new Stack<>();

        for (String value : values) {
            if (value.equals("(")) {
                stack.add(value);
            }
            if (value.equals("[")) {
                stack.add(value);
            }
            if (value.equals("]")) {
                if (!stack.isEmpty() && "[".equals(stack.peek())) {
                    stack.pop();
                } else {
                    stack.add(value);
                    break;
                }
            }
            if (value.equals(")")) {
                if (!stack.isEmpty() && "(".equals(stack.peek())) {
                    stack.pop();
                } else {
                    stack.add(value);
                    break;
                }
            }
        }

        return (stack.isEmpty()) ? "yes" : "no";
    }
}
