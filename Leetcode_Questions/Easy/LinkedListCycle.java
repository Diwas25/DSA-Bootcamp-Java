package Easy;

//Floyd's Cycle Finding Algorithm
//Hare and Tortoise Algorithm

//watch?v=H9-L8s6c59Y
//TC - O(n) , SC - O(n)

//need it to solve properly
public class LinkedListCycle {
    public static boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        System.out.println(hasCycle(l1));
    }
}
