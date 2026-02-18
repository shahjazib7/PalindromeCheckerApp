import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {




                String input = "racecar";


                String reversed = "";

                for (int i = input.length() - 1; i >= 0; i--) {
                    reversed += input.charAt(i);
                }

           g
                if (input.equalsIgnoreCase(reversed)) {
                    System.out.println("String: " + input);
                    System.out.println("It is a palindrome.");
                } else {
                    System.out.println("String: " + input);
                    System.out.println("It is not a palindrome.");
                }
            }
        }
