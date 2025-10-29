class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class ThirdFromEndLinkedList {
    
    // Returns the 3rd node from the end of linked list, or null if less than 3 nodes.
    public static ListNode thirdFromEnd(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        // Move fast pointer 3 steps ahead
        for (int i = 0; i < 3; i++) {
            if (fast == null) return null; // fewer than 3 nodes
            fast = fast.next;
        }
        
        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        head.next.next = new ListNode(15);
        head.next.next.next = new ListNode(20);
        head.next.next.next.next = new ListNode(25);
        
        ListNode thirdNode = thirdFromEnd(head);
        if (thirdNode != null) {
            System.out.println("3rd node from end value: " + thirdNode.val);
        } else {
            System.out.println("List has fewer than 3 nodes");
        }
    }
}
