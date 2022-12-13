package Easy;

  //Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class MergeTwoSortedLists {
    public static void print(ListNode head)
    {
        while(head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
        return;
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                result.next = l1;
                l1 = l1.next;
            }else{
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }
        if(l1!=null){
            result.next=l1;
        }else{
            result.next=l2;
        }
        return head.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        print(mergeTwoLists(l1,l2));
    }
}
