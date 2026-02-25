class Node {
    int data;
    Node next;

<<<<<<< HEAD
class PalindromeIgnore {

    static boolean isPalindrome(String str) {

        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input))
=======
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class PalindromeRecursion {

    static Node left; // Pointer from start

    // Insert at end
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    // Recursive palindrome check
    static boolean isPalindromeUtil(Node right) {
        if (right == null)
            return true;

        boolean result = isPalindromeUtil(right.next);
        if (!result)
            return false;

        // Compare left and right
        if (left.data != right.data)
            return false;

        left = left.next; // Move forward
        return true;
    }

    static boolean isPalindrome(Node head) {
        left = head;
        return isPalindromeUtil(head);
    }

    // Display list
    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 2);
        head = insert(head, 1);

        display(head);

        if (isPalindrome(head))
>>>>>>> 9692c111f085f06b04187e5bf61a1f0018cb315a
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}git add src