package LinkedList;

public class SortLL {
    static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next; // Return the first middle node in case of even nodes

        while (fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode merge(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (first != null && second != null) {
            if (first.val < second.val) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }

            tail = tail.next;
        }
        if (first != null) {
            tail.next = first;
        }

        if (second != null) {
            tail.next = second;
        }
        return dummy.next;
    }
    public static ListNode mergeSort(ListNode  head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next =null;

        return merge(mergeSort(left), mergeSort(right));
    }

    static void main() {
        // Create linked list
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next = new ListNode(3);

        ListNode  temp = head;
        while (temp != null){
            System.out.print(temp.val+ "-> ");
            temp = temp.next;
        }
        System.out.print("END\n");

        head = mergeSort(head);

        ListNode  temp2 = head;
        while (temp2 != null){
            System.out.print(temp2.val+ "-> ");
            temp2 = temp2.next;
        }
        System.out.print("END");

    }
}
