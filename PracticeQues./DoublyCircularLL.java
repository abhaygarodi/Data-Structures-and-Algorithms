class DoublyCircularLL{

    Node head;

    class Node {
        String data;
        Node next, prev;

        Node(String data) {
            this.data = data;
        }
    }

    // Add at end
    public void add(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;
        newNode.next = head;
        head.prev = newNode;
    }

    // Print forward
    public void printList() {
        if (head == null) return;

        Node curr = head;
        do {
            System.out.print(curr.data + " ⇄ ");
            curr = curr.next;
        } while (curr != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        DoublyCircularLL cdll = new DoublyCircularLL();
        cdll.add("A");
        cdll.add("B");
        cdll.add("C");
        cdll.printList();
    }
}
