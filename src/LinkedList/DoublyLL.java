package LinkedList;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;

    class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int val){
            this.value = val;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head;

        if(head != null){
            head.prev = node;
        } else {
            tail = node;
        }

        head = node;
        size++;
    }
    public void addLast(int val){
        Node node = new Node(val);

        if(tail == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }


    private Node getRef(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+ " <-> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public void displayReverse(){
        Node temp = tail;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }

        System.out.println("START");
    }
    public int size(){
        return this.size;
    }

    static void main() {
        DoublyLL list = new DoublyLL();

        list.addFirst(12);
        list.addFirst(10);
        list.addFirst(5);

        list.display();

        list.addLast(21);
        list.addLast(87);

        list.display();
        list.displayReverse();

        System.out.println("Size: " + list.size);
    }
}
