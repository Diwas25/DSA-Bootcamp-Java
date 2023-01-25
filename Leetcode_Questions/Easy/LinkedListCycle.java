package Easy;

//Floyd's Cycle Finding Algorithm
//Hare and Tortoise Algorithm

//watch?v=H9-L8s6c59Y
//TC - O(n) , SC - O(n)

import java.util.LinkedList;

//need it to solve properly
class LinkedListCycle {
    static Node head; // head of list

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function that detects loop in the list
    static boolean detectLoop() {
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();

        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        list.head.next.next.next.next.next = list.head.next.next;

        if (detectLoop()) {
            System.out.println("Loop found");
        } else {
            System.out.println("No Loop");
        }
    }
}


