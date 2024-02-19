public class ArrayStack<E> implements Stack<E>{
    public static final int Capacity=1000;
    private E data[];
    private int t=-1;

    public ArrayStack(int capacity) {
        data= (E[]) new Object[capacity];
    }

    public ArrayStack() {
        this(Capacity);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return data[t];
    }

    @Override
    public void push(E element)throws IllegalStateException {
        if (size()==data.length)throw new IllegalStateException("Stack is full");
        data[++t]=element;

    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E deleted=data[t];
        data[t]=null;
        t--;
        return deleted;
    }

//    public void  transfer(Stack<E> s, Stack<E> t){
//        if (s.isEmpty())
//            return;
//        Stack<E> tempStack = new Stack<>();
//        while (!s.isEmpty()){
//            tempStack.push(s.pop());
//
//        }
//        while (!tempStack.isEmpty()) {
//            t.push(tempStack.pop());
//        }
//    }
    public void revers(Stack<E> stack){
        if (stack.isEmpty()){
            return;
        }
        stack.pop();
        revers(stack);
    }
}