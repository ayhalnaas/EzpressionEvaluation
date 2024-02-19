public class Linkedstack<E> implements Stack<E> {
    private SinglyLinkedList<E>list= new SinglyLinkedList<E>();
//    Stack<E> tempStack = new Stack<>() ;
//        @Override
//        public void transfer(Stack<E> s, Stack<E> t) {
//            if (s.isEmpty())
//                return;
//
//            while (!s.isEmpty()){
//                tempStack.push(s.pop());
//
//            }
//            while (!tempStack.isEmpty()) {
//                t.push(tempStack.pop());
//            }
//        }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {
        return list.frist();
    }

    @Override
    public void push(E element) {
        list.addfirst(element);

    }

    @Override
    public E pop() {
        return list.removeFirst();
    }
    public void revers(Stack<E> stack){
        if (stack.isEmpty()){
            return;
        }
        stack.pop();
        revers(stack);
    }
}