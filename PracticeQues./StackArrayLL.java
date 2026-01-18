// public class StackClass {


    //LinkedList form stack implementation
    // static class Node {
    //     int data;
    //     Node next;

    //     Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // static class Stack {
    //     private Node head;

    //     public boolean isEmpty() {
    //         return head == null;
    //     }

    //     public void push(int data) {
    //         Node newNode = new Node(data);
    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     public int pop() {
    //         if (isEmpty()) {
    //             System.out.println("Stack underflow");
    //             return -1;
    //         }

    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     public int peek() {
    //         if (isEmpty()) {
    //             System.out.println("Stack is empty");
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }
//       public static void main(String[] args) {
//         Stack s = new Stack();

//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

import java.util.*;

public class StackArrayLL {

    static class Stack {
        private ArrayList<Integer> list = new ArrayList<>();

        // Check if stack is empty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // Push element
        public void push(int data) {
            list.add(data);
        }

        // Pop element
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
