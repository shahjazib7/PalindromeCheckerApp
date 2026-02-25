class PalindromeChecker {

    private String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String processed = text.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = processed.length() - 1;

        while (left < right) {
            if (processed.charAt(left) != processed.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}

class Main {
    public static void main(String[] args) {

        PalindromeChecker obj =
                new PalindromeChecker("Never Odd Or Even");

        if (obj.isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}