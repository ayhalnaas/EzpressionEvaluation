public interface Stack<E> {
    boolean isEmpty();
    int size();
    E top();
    void push(E element);
    E pop();
//    void  transfer(Stack<E> s, Stack<E> t);
    void revers(Stack<E> stack);
}
