
public class LinkedQueue<E> implements Queue <E>{
    SinglyLinkedList<E> list=new SinglyLinkedList<E>();
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void enqueue(E element) {
        list.addLast(element);

    }

    @Override
    public E first() {
        return list.frist();
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

}
