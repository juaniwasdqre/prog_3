package tp1.DoublyLinkedList;

import tp1.AbstractIterator;
import java.util.Iterator;

public class DoublyLinkedListIterator<T> extends AbstractIterator<T, DoubleNode<T>> implements Iterator<T> {

    public DoublyLinkedListIterator(DoubleNode<T> head){
        pointer = head;
    }

}