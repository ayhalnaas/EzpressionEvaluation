package ass4singlylinkedlist;

import java.util.Scanner;
//q5 lab6
public class Doubly_Linked_list<E>{
    private Node<E> head;
    private int size ;

    public Doubly_Linked_list() {
        head = new Node<>(null,null,null);
        size = 0;
    }
    public int size(){
        return size ;
    }
    public boolean isEmpty(){return size==0;}

    public E frist(){
        if (isEmpty())return null ;

        return head.getNext().getElement();
    }
    public  E last (){
        if (isEmpty())return null ;

        return head.getPrev().getElement();

    }
    private void addBetween(E e, Node<E> p,Node<E> n){
        Node<E> newest = new Node<>(e,p,n);
        p.setNext(newest);
        n.setPrev(newest);
        size++;
    }

    public void addfirst(E e){
        addBetween(e,head,head.getNext());
    }
    public void addLast(E e){
        addBetween(e,head.getPrev(),head);
    }
    private E remove(Node<E> x){
        Node<E> p = x.getPrev();
        Node<E> n = x.getNext();
        p.setNext(n);
        n.setPrev(p);
        size--;
        return   x.getElement();
    }
    public E removeFirst(){
        if (isEmpty())return null;
        return remove(head.getNext());
    }
    public E removeLast(){
        if (isEmpty())return null;
        return remove(head.getPrev());
    }


    private static  class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev,  Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    public static void main(String[] args) {
        Doubly_Linked_list<String> doubleLinkedList = new Doubly_Linked_list<>();
        Scanner input = new Scanner(System.in);
        int c ;
        while (true){
            System.out.println(" 1- add first \t 2- add last \t 3- remove first \t 4- remove last \n" +
                    " 5- size \t 6- first \t 7- last \t 8- view all \t 0- exit ");
            c = input.nextInt();
            switch (c){
                case 1 :
                    System.out.println("input name to add first");
                    doubleLinkedList.addfirst(input.next());
                    System.out.println(doubleLinkedList.frist()+" is added first successfully");
                    break;
                case 2 :
                    System.out.println("input name to add last");
                    doubleLinkedList.addLast(input.next());
                    System.out.println(doubleLinkedList.last()+" is added last successfully");
                    break;
                case 3 :
                    System.out.println( doubleLinkedList.removeFirst()+" remove first successfully: ");
                    break;
                case 4 :
                    System.out.println( doubleLinkedList.removeLast()+" remove last successfully: ");
                    break;
                case 5 :
                    System.out.println( doubleLinkedList.size()+" is  the size: ");
                    break;
                case 6 :
                    System.out.println( doubleLinkedList.frist()+" is  the first element: ");
                    break;
                case 7 :
                    System.out.println( doubleLinkedList.last()+" is  the last element: ");
                    break;
                case 8 :
                    while (!doubleLinkedList.isEmpty()){
                        System.out.println(doubleLinkedList.removeFirst()+" ");
                    }
                    break;
                case 0 :
                    System.exit(0);

            }
        }



    }
}
