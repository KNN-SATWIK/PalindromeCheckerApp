public class Usecase4PalindromeCheckerApp {

    public static boolean isPalindrome(String s) {
        // 1. Convert string to character array
        char[] charArray = s.toCharArray();

        // 2. Initialize two pointers
        int left = 0;
        int right = charArray.length - 1;

        // 3. Iterate and compare
        while (left < right) {
            // Compare characters at the current pointers
            if (charArray[left] != charArray[right]) {
                // If characters don't match, it's not a palindrome
                return false;
            }

            // 4. Move pointers towards the center
            left++;
            right--;
        }

        // If the loop completes without finding non-matching characters, it is a palindrome
        return true;
    }

    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";

        System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
    }
}

