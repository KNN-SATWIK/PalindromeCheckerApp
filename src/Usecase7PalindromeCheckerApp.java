import java.util.ArrayDeque;
import java.util.Deque;

public class Usecase7PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        // Clean the input: remove spaces and convert to lowercase
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        // Step 1: Insert characters into Deque
        Deque<Character> charDeque = new ArrayDeque<>();
        for (char ch : cleanInput.toCharArray()) {
            charDeque.addLast(ch);
        }

        // Step 2 & 3: Remove first & last and compare
        while (charDeque.size() > 1) {
            char first = charDeque.removeFirst();
            char last = charDeque.removeLast();

            if (first != last) {
                return false; // Mismatch found
            }
        }

        return true; // All pairs matched or only 1 character left
    }

    public static void main(String[] args) {
        String test = "Racecar";
        System.out.println("Is \"" + test + "\" a palindrome? " + isPalindrome(test));
    }
}
