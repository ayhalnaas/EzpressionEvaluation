package ass4singlylinkedlist;
//q3 lab8
public class Linked_Queue<E> {
    Node<E> front;
    Node<E> rear;
    int size;
    public Linked_Queue(){
        front = null;
        rear = null;
        size = 0;
    }
    private static  class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = null;
        }
    }
    public void concatenate(Linked_Queue<E> Q2){
        if (Q2.size ==0 ){
            return;
        }
        if (size == 0){
            front = Q2.front;
        }else {
            rear.next = Q2.front;
        }
        rear= Q2.rear;
        size += Q2.size;
    }

}

