import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class FifoLifoDemo {

    public static void main(String[] args) {



        Queue<String> queue = new LinkedList<>();

        System.out.println("FIFO (Queue) Example:");


        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue: " + queue);

        while (!queue.isEmpty()) {
            String removed = queue.remove(); // removes from front
            System.out.println("Removed: " + removed + " | Remaining Queue: " + queue);
        }

        System.out.println("\n-------------------------------\n");


        Stack<String> stack = new Stack<>();

        System.out.println("LIFO (Stack) Example:");


        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack: " + stack);

        while (!stack.isEmpty()) {
            String removed = stack.pop(); // removes from top
            System.out.println("Popped: " + removed + " | Remaining Stack: " + stack);
        }
    }
}

