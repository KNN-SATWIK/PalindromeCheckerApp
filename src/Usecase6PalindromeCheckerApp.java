import java.util.*;

public class Usecase6PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "JAVA";

        // 1. Queue for FIFO (First In First Out)
        Queue<Character> queue = new LinkedList<>();
        // 2. Stack for LIFO (Last In First Out)
        Stack<Character> stack = new Stack<>();

        // Flow: Enqueue and Push
        for (char c : word.toCharArray()) {
            queue.add(c);   // Enqueue
            stack.push(c);  // Push
        }

        System.out.println("Original Word: " + word);

        // Flow: Compare Dequeue vs Pop
        System.out.print("Queue (FIFO) Dequeue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll()); // Removes 'J' first
        }

        System.out.print("\nStack (LIFO) Pop:      ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());  // Removes 'A' first (reverses order)
        }
    }
}
