public class LinkedStack <E> implements Stack<E>{
    CircularlyLinkedList<E>l=new CircularlyLinkedList<>();


    @Override
    public int size() {
        return l.size();
    }

    @Override
    public boolean isEmpty() {
        return l.isEmpty();
    }

    @Override
    public void push(E e) {
l.addFirst(e);
    }

    @Override
    public E pop() {
        return l.removeFirst();
    }

    @Override
    public E top() {
        return l.first();
    }
}
