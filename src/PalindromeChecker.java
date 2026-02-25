import java.util.Scanner;

class PalindromeAlgorithms {

    // Method 1: Iterative (Two-pointer)
    static boolean iterative(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Method 2: Recursive
    static boolean recursive(String str, int left, int right) {
        if (left >= right)
            return true;
        if (str.charAt(left) != str.charAt(right))
            return false;
        return recursive(str, left + 1, right - 1);
    }

    // Method 3: Reverse String
    static boolean reverseMethod(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        System.out.println("\nChoose algorithm:");
        System.out.println("1. Iterative");
        System.out.println("2. Recursive");
        System.out.println("3. Reverse String");

        int choice = sc.nextInt();

        boolean result = false;

        switch (choice) {
            case 1:
                result = PalindromeAlgorithms.iterative(input);
                break;

            case 2:
                input = input.replaceAll("\\s", "").toLowerCase();
                result = PalindromeAlgorithms.recursive(input, 0, input.length() - 1);
                break;

            case 3:
                result = PalindromeAlgorithms.reverseMethod(input);
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        if (result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}