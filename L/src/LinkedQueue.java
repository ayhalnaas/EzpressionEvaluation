public class LinkedQueue<E> implements Queue<E> {

  CircularlyLinkedList<E>l= new CircularlyLinkedList<>();

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public boolean isEmpty() {
        return l.isEmpty();
    }

    @Override
    public void enqueue(E e) {
l.addLast(e);
    }

    @Override
    public E dequeue() {
        return l.removeFirst();
    }

    @Override
    public E first() {
        return l.first();
    }
    public E last() {
        return l.last();
    }
}
