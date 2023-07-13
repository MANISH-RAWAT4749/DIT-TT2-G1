class RemoveNthNode {
public:
   Node removeNthNodeFromEnd(Node head, int n) {
    if (head == null) {
        return null;
    }

    Node dummy = new Node(0);
    dummy.next = head;

    Node slow = dummy;
    Node fast = dummy;

    for (int i = 0; i < n; i++) {
        fast = fast.next;
    }

    while (fast.next != null) {
        slow = slow.next;
        fast = fast.next;
    }

    slow.next = slow.next.next;

    return dummy.next;
}
};
