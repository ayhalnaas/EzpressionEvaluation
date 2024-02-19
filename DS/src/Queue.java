public interface Queue<E> {
    int size();
    boolean isEmpty();
    void enqueue(E element);
    E first();
    E dequeue();
}
