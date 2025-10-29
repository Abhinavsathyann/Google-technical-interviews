public class MergeSortedLinkedLists {
    
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MergeSortedLinkedLists {
    // Iteratively merges two sorted linked lists.
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    // Utility to print linked list.
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);

        ListNode merged = mergeTwoLists(head1, head2);
        printList(merged); // Output: 1 2 3 4 5 6
    }
}
