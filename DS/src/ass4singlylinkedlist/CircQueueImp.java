package ass4singlylinkedlist;

public class CircQueueImp<E> implements CircularQueue<E> {
    private CircularlyLinkedList<E> list= new CircularlyLinkedList<E>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public void enqueue(E e) {
        list.addlast(e);
    }

    @Override
    public E dequeue() {
        return list.removefirst();
    }

    @Override
    public void rotate() {
        list.rotate();
    }
}
