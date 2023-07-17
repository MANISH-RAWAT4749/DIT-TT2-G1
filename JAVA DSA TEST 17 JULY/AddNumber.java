import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr = curr.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter the length of the first linked list: ");
        int n1 = scanner.nextInt();
        ListNode l1 = null;
        ListNode prev1 = null;

        System.out.println("Enter the elements of the first linked list:");
        for (int i = 0; i < n1; i++) {
            int num = scanner.nextInt();
            ListNode node = new ListNode(num);

            if (l1 == null) {
                l1 = node;
            } else {
                prev1.next = node;
            }

            prev1 = node;
        }

        System.out.print("Enter the length of the second linked list: ");
        int n2 = scanner.nextInt();
        ListNode l2 = null;
        ListNode prev2 = null;

        System.out.println("Enter the elements of the second linked list:");
        for (int i = 0; i < n2; i++) {
            int num = scanner.nextInt();
            ListNode node = new ListNode(num);

            if (l2 == null) {
                l2 = node;
            } else {
                prev2.next = node;
            }

            prev2 = node;
        }

        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println("Output Linked List:");
        solution.printLinkedList(result);
    }
}
