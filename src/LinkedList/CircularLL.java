package LinkedList;



public class CircularLL {
    private CircularLL.Node head;
    private CircularLL.Node tail;
    private int size;

    class Node{
        private int value;
        private CircularLL.Node next;

        public Node(int val){
            this.value = val;
        }
        public Node(int value,  CircularLL.Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
        } else {
            node.next = head;
            head = node;
            tail.next = head;
        }

        size++;
    }
    public void addLast(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        node.next = head;
        size++;
    }
    public void remove(int index){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if(index == 0){
            if (size == 1){
                head = null;
                tail = null;
            }
            head = head.next;
            tail.next = head;
            size--;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (index == size - 1) {
            tail = temp;
        }
        size--;

    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("HEAD");
    }

    static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.addLast(20);
        cll.addLast(30);
        cll.addLast(40);
        cll.addFirst(10);
        cll.display();
        cll.remove(0);
        cll.display();
    }
}
