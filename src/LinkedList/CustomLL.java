package LinkedList;

public class CustomLL {
    private Node head;
    private Node tail;
    private int size;

    public CustomLL(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public int getSize(){
        return this.size;
    }

    public void addFirst(int n) {
        Node node = new Node(n);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = node;
        }
        size++;
    }

    public void addLast(int n){
        Node node = new Node(n);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insert(int index, int val){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }else if (index == 0){
            addFirst(val);
            return;
        } else if (index == size) {
            addLast(val);
            return;
        };

        Node temp = getRef(index-1);
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public void deleteFirst(){
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
    }
    public void deleteLast(){
        if (size == 1 ){
            deleteFirst();
        }
        Node secondLast = getRef(size - 2);
        tail = secondLast;
        secondLast.next = null;
        size--;
    }

    public void delete(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (index == 0){
            deleteFirst();
            return;
        }
        Node temp = getRef(index-2);
        temp.next = temp.next.next;

        if (temp.next == null) {
            tail = temp;
        }
        size--;

    }

    public Node getRef(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int find(int val) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.value == val) {
                return index;
            }

            temp = temp.next;
            index++;
        }

        return -1;
    }
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }
}
