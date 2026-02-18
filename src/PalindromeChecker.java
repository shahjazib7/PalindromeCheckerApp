import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {


                String input = "madam";

                input = input.toLowerCase();

                Stack<Character> stack = new Stack<>();


                for (int i = 0; i < input.length(); i++) {
                    stack.push(input.charAt(i));
                }


                String reversed = "";

                while (!stack.isEmpty()) {
                    reversed += stack.pop();
                }


                System.out.println("Original String: " + input);
                if (input.equals(reversed)) {
                    System.out.println("It is a palindrome.");
                } else {
                    System.out.println("It is not a palindrome.");
                }
            }
        }

    }

