class DoublyLinkedList {

    Node head;

    class Node {
        String data;
        Node prev, next;

        Node(String data) {
            this.data = data;
        }
    }

    // Add at beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
 
 
    // Print forward
    public void printForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst("C");
        dll.addFirst("B");
        dll.addFirst("A");
        dll.printForward();
    }
}

