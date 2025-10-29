class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LinkedListIntersection {

    // Returns the intersection node if two lists intersect, else null
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        // List A: 1 -> 2 -> 3 -> 4
        // List B:           5 -> 6
        // Intersection at node with value 3
        ListNode common = new ListNode(3);
        common.next = new ListNode(4);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = common;

        ListNode intersection = getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection node value: " + intersection.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
