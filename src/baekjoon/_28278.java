package baekjoon;

import java.io.*;

public class _28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack stack = new Stack();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            int command = Integer.parseInt(values[0]);

            if (command == 1) {
                Node node = new Node(Integer.parseInt(values[1]));
                stack.add(node);
            } else if (command == 2) {
                bw.write(stack.remove() + "\n");
            } else if (command == 3) {
                bw.write(stack.size() + "\n");
            } else if (command == 4) {
                bw.write(stack.isEmpty() + "\n");
            } else if (command == 5) {
                bw.write(stack.peek() + "\n");
            }
        }

        bw.flush();
    }
}

class Stack {
    private Node root;
    private int size;

    public int isEmpty() {
        return (size == 0) ? 1 : 0;
    }

    public void add(Node node) {
        node.setNext(root);
        root = node;
        size++;
    }

    public int size() {
        return size;
    }

    public int remove() {
        if (this.isEmpty() == 1) {
            return -1;
        } else {
            int value = root.getValue();
            root = root.getNext();
            size--;
            return value;
        }
    }

    public int peek() {
        if (this.isEmpty() == 1) {
            return -1;
        } else {
            return root.getValue();
        }
    }

}

class Node {
    private final int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

}