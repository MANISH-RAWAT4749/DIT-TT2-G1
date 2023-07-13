class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    MyLinkedList() {
        this.head = null;
    }

    int get(int index) {
        if (index < 0) {
            return -1;
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            if (node == null) {
                return -1;
            }
            node = node.next;
        }

        return node.val;
    }

    void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }

        Node node = head;
        while (node.next != null) {
            node = node.next;
        }

        node.next = newNode;
    }

    void deleteAtHead() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    void deleteAtTail() {
        if (head == null) {
            return;
        }

        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }

        node.next = null;
    }
}
