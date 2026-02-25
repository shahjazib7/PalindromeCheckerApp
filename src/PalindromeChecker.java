import java.util.Scanner;

class PalindromePerformance {

    // Iterative Method
    static boolean iterative(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Recursive Method
    static boolean recursive(String str, int left, int right) {
        if (left >= right)
            return true;
        if (str.charAt(left) != str.charAt(right))
            return false;
        return recursive(str, left + 1, right - 1);
    }

    // Reverse String Method
    static boolean reverseMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Remove spaces & case for fair comparison
        input = input.replaceAll("\\s", "").toLowerCase();

        long start, end;

        // Iterative
        start = System.nanoTime();
        boolean res1 = PalindromePerformance.iterative(input);
        end = System.nanoTime();
        System.out.println("Iterative: " + res1 +
                " | Time: " + (end - start) + " ns");

        // Recursive
        start = System.nanoTime();
        boolean res2 = PalindromePerformance.recursive(input, 0, input.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive: " + res2 +
                " | Time: " + (end - start) + " ns");

        // Reverse String
        start = System.nanoTime();
        boolean res3 = PalindromePerformance.reverseMethod(input);
        end = System.nanoTime();
        System.out.println("Reverse: " + res3 +
                " | Time: " + (end - start) + " ns");
    }
}