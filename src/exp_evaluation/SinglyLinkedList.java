package exp_evaluation;

public class SinglyLinkedList <E>{
     Node<E> head = null;
     Node<E> tail = null;
    private int size = 0 ;

    public SinglyLinkedList() {
    }
    public int size(){
        return size ;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public E frist(){
        if (isEmpty())return null ;
        return head.getElement();
    }
    public  E last (){
        if (isEmpty())return null ;
        return tail.getElement();

    }
    public void addfirst(E e){
        head = new Node<>(e ,head);
        if (size==0)
            tail = head ;
        size++;
    }
    public void addLast(E e){
        Node<E> newest = new Node<>(e ,null);
        if (size==0)
            head = newest ;
        else
            tail.setNext(newest);
        tail=newest;
        size++;
    }
    public E removeFirst(){
        if (isEmpty())return null;
        E deleted = head.getElement();
        head=head.getNext();
        size--;
        if (size==0)tail=null;
        return deleted;


    }
    public String print(){
        String all =" ";
        Node<E> i = head;
        while (i != null){
            all = all + i.getElement().toString() + "\n";
            i = i.next;
        }
        return all ;
    }

    private static  class Node<E> {
        private E element;
        private Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }


    }}

