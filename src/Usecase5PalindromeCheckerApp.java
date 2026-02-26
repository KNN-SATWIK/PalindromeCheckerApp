import java.util.Stack;
import java.util.Scanner;

public class Usecase5PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Step 1: Push characters into stack
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Step 2: Pop and compare with original string
        for (int i = 0; i < str.length(); i++) {
            char originalChar = str.charAt(i);
            char reversedChar = stack.pop(); // Removes and returns top element

            if (originalChar != reversedChar) {
                return false; // Mismatch found
            }
        }
        return true; // All characters matched
    }
}
