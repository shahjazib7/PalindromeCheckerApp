class Node {
    int data;
    Node next;

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
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}