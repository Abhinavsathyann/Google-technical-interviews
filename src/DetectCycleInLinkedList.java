class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class DetectCycleInLinkedList {
    // Returns true if there is a cycle in the linked list
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    // Example usage
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head; // Creating a cycle for testing

        boolean hasCycle = hasCycle(head);
        System.out.println("Cycle detected: " + hasCycle);
    }
}
