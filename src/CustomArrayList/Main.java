package CustomArrayList;

import javax.swing.*;

public class Main {
    static void main() {
        CustomArrayList list = new CustomArrayList();
//        list.remove();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);
        list.printList();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.printList();
        System.out.println(list.getData(3));
        System.out.println(list.size());
        list.set(5,10);
        list.printList();
    }


}
