// 141. Linked List Cycle
//https://leetcode.com/problems/linked-list-cycle/description/

package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class CycleInLL {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public int cycleLenght(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int length = 1;
                fast = fast.next;
                while (slow != fast) {
                    fast = fast.next;
                    length++;
                }
                return length;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        // Create linked list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Cyle 5->2
        head.next.next.next.next = head.next;



        CycleInLL solution = new CycleInLL();

        System.out.println(solution.hasCycle(head)); // true
        System.out.println("Length of Cycle : "+solution.cycleLenght(head)); // true
    }
}