package LinkedList;

public class SortLL {
    static ListNode getMid(ListNode head) {
        ListNode midPrev = null;

        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        ListNode mid = midPrev.next;
        midPrev.next = null;

        return mid;
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
        ListNode mid = getMid(head);
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(mid);

        return merge(left, right);
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
        System.out.print("END");
        System.out.println();

        head = mergeSort(head);

        ListNode  temp2 = head;
        while (temp2 != null){
            System.out.print(temp2.val+ "-> ");
            temp2 = temp2.next;
        }
        System.out.print("END");

    }
}
