package ass4singlylinkedlist;

public interface Stack<E> {
    boolean isEmpty();
    int size();
    E top();
    void push(E element);
    E pop();
    //q1 lab7
//    void  transfer(Stack<E> s, Stack<E> t);
    //q2 lab7
    void revers(Stack<E> stack);
}
