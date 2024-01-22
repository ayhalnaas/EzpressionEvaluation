package exp_evaluation;

public class LinkedStack<E> implements Stack<E> {
    private SinglyLinkedList<E> list =new SinglyLinkedList<>();


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addfirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E top() {
        return list.frist();
    }
}


