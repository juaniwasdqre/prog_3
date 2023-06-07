package tp1;

//import tp1.DoublyLinkedList.DoubleLinkedList;
import tp1.LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(5);
        list1.add(3);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(1);

        System.out.println(list1);

        list1.extractFront();
        System.out.println(list1);

        System.out.println(list1.isEmpty());
        System.out.println(list1.size);

        list1.delete(10);
        System.out.println(list1);
        System.out.println(list1.size);

    }
}