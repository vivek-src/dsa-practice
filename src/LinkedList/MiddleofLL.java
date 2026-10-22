// 876. Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/description/
package LinkedList;

public class MiddleofLL {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static void main() {
        // Create linked list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        MiddleofLL ll = new MiddleofLL();
        System.out.println("Middle of LL : "+ll.middleNode(head).val);
    }
}


