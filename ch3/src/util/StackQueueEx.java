package util;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        // stack.add(null)
        stack.push("0");
        stack.push("1");
        stack.push("2");
        System.out.println("stack");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        // queue.add(null);
        queue.offer("0");
        queue.offer("1");
        queue.offer("2");
        System.out.println("queue");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
