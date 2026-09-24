package LinkedList;

public class Main {

    static void main() {
        CustomLL LL = new CustomLL();
        System.out.println(LL.getSize());

        LL.addFirst(20);
        LL.addFirst(210);
        LL.addFirst(23);
        LL.addFirst(34);
        LL.addLast(12);

        LL.display();
        LL.insert(1,300);
        LL.display();

        LL.delete(1);
        LL.display();
        LL.delete(1);
        LL.display();
        int index = LL.find(2110);
        System.out.println(index);
    }

}
