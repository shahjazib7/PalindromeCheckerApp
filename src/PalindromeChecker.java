import java.util.Stack;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Add node at the end
    void append(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Check palindrome
    boolean isPalindrome() {
        Stack<Character> stack = new Stack<>();
        Node temp = head;

        // Push all characters into the stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // Compare stack with linked list
        temp = head;
        while (temp != null) {
            if (temp.data != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }
}

public class PalindromeSinglyLinkedList {

    public static void main(String[] args) {
        String input = "level";
        input = input.toLowerCase();

        SinglyLinkedList list = new SinglyLinkedList();

        // Add each character to the linked list
        for (int i = 0; i < input.length(); i++) {
            list.append(input.charAt(i));
        }

        System.out.println("String: " + input);
        if (list.isPalindrome()) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
