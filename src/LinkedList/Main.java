package LinkedList;

public class Main {

    static void main() {
        CustomLL LL = new CustomLL();
        System.out.println(LL.getSize());

//        LL.addFirst(10);
//        LL.addFirst(210);
//        LL.addFirst(23);
//        LL.addFirst(34);
//        LL.addLast(12);
//
//        LL.display();
//        LL.insert(1,300);
//        LL.display();
//
//        LL.delete(1);
//        LL.display();
//        LL.delete(1);
//        LL.display();
////        int index = LL.find(2110);
////        System.out.println(index);
//        LL.insertRec(1,220);
//        LL.insertRec(1,220);
//        LL.display();

        LL.addLast(1);
        LL.addLast(3);
        LL.addLast(4);
        LL.addLast(6);
        LL.addLast(9);
        LL.addLast(13);
        LL.addLast(34);
        LL.display();
//        LL.deleteDuplicates();
//        LL.display();

        CustomLL LL2 = new CustomLL();
        LL2.addLast(1);
        LL2.addLast(1);
        LL2.addLast(5);
        LL2.addLast(6);
        LL2.addLast(7);
        LL2.display();

        CustomLL Merged = CustomLL.merge(LL2, LL);
        System.out.println("Lists after Merging: ");
        Merged.display();
    }

}
