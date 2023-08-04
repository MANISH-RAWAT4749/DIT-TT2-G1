import java.util.LinkedList;

public class LinkedListProb {

    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Find the middle element in the linked list
        System.out.println("The middle element in the linked list is: " + findMiddleElement(list));

        // Find the nth node from the end of the linked list
        System.out.println("The 3rd node from the end of the linked list is: " + findNthNodeFromEnd(list, 3));

        // Detect and remove a cycle in the linked list
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        createCycle(list);
        System.out.println("The linked list has a cycle: " + hasCycle(list));
        removeCycle(list);
        System.out.println("The linked list has no cycle: " + hasCycle(list));

        // Remove the nth node from the end of the linked list
        System.out.println("The linked list after removing the 3rd node from the end is: " + removeNthNodeFromEnd(list, 3));

        // Reverse the linked list
        System.out.println("The reversed linked list is: " + reverseLinkedList(list));

        // Check if the linked list is a palindrome
        System.out.println("The linked list is a palindrome: " + isPalindrome(list));

        // Find the intersection of two linked lists
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        System.out.println("The intersection of the two linked lists is: " + getIntersection(list, list2));

        // Split the linked list into two singly linked lists in alternative fashion
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        splitLinkedList(list, list1, list2);
        System.out.println("The first linked list is: " + list1);
        System.out.println("The second linked list is: " + list2);

        // Add two big numbers using linked lists
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(9);
        list3.add(9);
        list3.add(9);
        list3.add(9);
        list3.add(9);
        list3.add(9);
        list3.add(9);
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        System.out.println("The sum of the two linked lists is: " + addTwoBigNumbers(list3, list4));

        // Split a circular linked list
        LinkedList<Integer> circularList = new LinkedList<>();
        circularList.add(1);
        circularList.add(2);
        circularList.add(3);
        circularList.add(4);
        circularList.add(5);
        circularList.add(6);
        circularList.add(7);
        circularList.add(1);
        createCycle(circularList);
        System.out.println("The split circular linked lists are: " + splitCircularLinkedList(circularList));

        // Clone a linked list
        LinkedList<Integer> clonedList = cloneLinkedList(list);
        System.out.println("The cloned linked list is: " + clonedList);

        // Implement LRU cache using linked list
        LRUCache cache = new LRUCache(5);
        cache.put(1, 10);
        cache.put(2, 20);
