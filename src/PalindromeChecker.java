import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {


        String input = "madam";
        String str = input.toLowerCase();

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }


        System.out.println("String: " + input);
        if (isPalindrome) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
