package ass4singlylinkedlist;

import java.util.Scanner;

public class CircularlyLinkedList<E>{
    private Node<E> tail = null;
    //private int size = 0 ;

    public Node<E> getTail() {
        return tail;
    }

    public CircularlyLinkedList() {
    }
    //q2 lab5
    public int size(){
        if(tail == null){
            return 0;
        }
        int count = 1 ;
        Node<E> x = tail.getNext();
        while (x!= tail){
            count++;
            x = x.getNext();
        }
        return count;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    // q3 lab5
    @Override
    public boolean equals(Object obj) {
        if(this ==obj){
            return true;}
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        CircularlyLinkedList<E> otherlist = (CircularlyLinkedList<E>) obj ;
        if (size() != otherlist.size()){
            return false;
        }
        Node<E> currentNode = tail.getNext();
        Node<E> othercurrentNode = otherlist.tail.getNext();
        while (currentNode != tail){
            if (!currentNode.getElement().equals(othercurrentNode.getElement())){
                return false;
            }
            currentNode = currentNode.getNext();
            othercurrentNode = othercurrentNode.getNext();
        }
        return true ;
    }

    public E first(){
        if (isEmpty())return null ;
        return tail.getNext().getElement();
    }
    public E last(){
        if (isEmpty())return null ;
        return tail.getElement();
    }
    // q1 lab5
    public void addfirst(E e){
        if (isEmpty()){
            tail= new Node<E>(e,null);
            tail.setNext(tail);
        }else {
            // Node<E> newset =new Node<>(e,tail.next);
            tail.setNext(new Node<E>(e,tail.getNext()));
        }
        int s = size();
        s++;
    }
    public void addlast(E e){
        addfirst(e);
        tail=tail.next;
    }
    public E removefirst(){
        if (isEmpty())return null ;
        Node<E> x = tail.next;
        if (x== tail){
            tail=null;
        }
        else {
            tail.setNext(x.getNext());

        }
        int s = size();
        s--;
        return x.element;
    }
    public void rotate(){
        if (tail!= null)
            tail= tail.next;
    }
    // q4 lab5
    public boolean sameSequence(CircularlyLinkedList<E> L,CircularlyLinkedList<E> M){
        if (L.size() != M.size()){
            return false ;
        }
        Node<E> startL = L.getTail().getNext();
        Node<E> startM = M.getTail().getNext();
        Node<E> currentL = startL;
        Node<E> currentM = startM;
        do{
            if (!currentL.getElement().equals(currentM.getElement())){
                return false;
            }
            currentL= currentL.getNext();
            currentM =currentM.getNext();
        }
        while (currentL != startL && currentM != startM);
        return true ;
    }
    public void print(){
        if(isEmpty()){
            System.out.println(" ");
            return;
        }
        Node<E> i = tail.getNext();
        do{
            System.out.println(i.getElement().toString());
            i=i.getNext();
        }while (i != tail);
        System.out.println(tail.getElement().toString());
    }
    //q5 lab5
    public CircularlyLinkedList<E>[] split (){
        if (tail == null || tail.getNext() == tail){
            return null;
        }
        int size = size();
        int halfSize = size/2;
        Node<E> current = tail.getNext();
        Node<E> previous = tail;
        int count =0;
        while (count < halfSize){
            previous=current;
            current = current.getNext();
            count++;
        }
        CircularlyLinkedList<E> firstHalfList = new CircularlyLinkedList<>();
        firstHalfList.tail = previous;
        firstHalfList.tail.setNext(tail.getNext());

        CircularlyLinkedList<E> secondHalfList = new CircularlyLinkedList<>();
        secondHalfList.tail = tail;
        secondHalfList.tail.setNext(current);
        CircularlyLinkedList<E>[] split = new CircularlyLinkedList[2];
        split[0] = firstHalfList;
        split[1] = secondHalfList;
        return split;
    }
    // q6 lab5
    public void clone(CircularlyLinkedList clonedList) {
        if (isEmpty()){
            return;}
            Node<E> current = tail.getNext();
            do {
                clonedList.addlast(current.getElement());
                current = current.getNext();
            }while (current!= tail);
            clonedList.addlast(tail.getElement());
        }

    private static  class Node<E> {
        private E element;
        Node<E> next;

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

    }
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> L = new CircularlyLinkedList();
        L.addfirst(1);
        L.addfirst(2);
        L.addfirst(3);
        L.addfirst(4);
        CircularlyLinkedList<Integer> M =  new CircularlyLinkedList();
        L.clone(M);
        System.out.println(L.sameSequence(L,M));
        System.out.println(L.size());
        System.out.println(L.equals(M));
        M.print();
        CircularlyLinkedList<Integer> LIST = new CircularlyLinkedList();
        LIST.addfirst(1);
        LIST.addfirst(2);
        LIST.addfirst(3);
        LIST.addfirst(4);
        CircularlyLinkedList<Integer>[] split =  LIST.split();
        split[0].print();
        System.out.println("----");
        split[1].print();
    }
}
