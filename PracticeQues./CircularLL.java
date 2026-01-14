class CircularLL {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    // Add node
    public void add(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = head;
    }

    // Print list
    public void printList() {
        if (head == null) return;

        Node curr = head;
        do {
            System.out.print(curr.data + " → ");
            curr = curr.next;
        } while (curr != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.add("A");
        cll.add("B");
        cll.add("C");
        cll.printList();
    }
}
