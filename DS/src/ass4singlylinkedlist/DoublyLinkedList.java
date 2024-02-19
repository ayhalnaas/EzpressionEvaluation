package ass4singlylinkedlist;

import java.util.Scanner;

public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
//    private int size = 0 ;

    public DoublyLinkedList() {
        head = new Node<>(null,null,null);
        tail = new Node<>(null,head,null);
        head.setNext(tail);
    }
    //q2 lab6
    public int size(){
        Node<E> x = head.getNext();
        int count = 0 ;
        while (x!= tail){
            count++;
            x = x.getNext();
        }
        return count;
    }
    public boolean isEmpty(){return size()==0;}
    //q3 lab6
    public boolean equals(Object obj) {
        if(this == obj){
            return true;}
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        DoublyLinkedList<E> otherlist = (DoublyLinkedList<E>) obj;
        if (size() != otherlist.size()){
            return false;
        }
        Node<E> currentNode = head.getNext();
        Node<E> othercurrentNode = otherlist.head.getNext();
        while (currentNode != tail){
            if (!currentNode.getElement().equals(othercurrentNode.getElement())){
                return false;
            }
            currentNode = currentNode.getNext();
            othercurrentNode = othercurrentNode.getNext();
        }
        return true ;
    }

    public E frist(){
        if (isEmpty())return null ;

        return head.getNext().getElement();
    }
    public  E last (){
        if (isEmpty())return null ;

        return tail.getPrev().getElement();

    }
    private void addBetween(E e, Node<E> p, Node<E> n){
        Node<E> newest = new Node<>(e,p,n);
        p.setNext(newest);
        n.setPrev(newest);
        int s = size();
        s++;
    }

    public void addfirst(E e){
        addBetween(e,head,head.next);
    }
    public void addLast(E e){
        addBetween(e,tail.prev,tail);
    }
    private E remove(Node<E> x){
        Node<E> p = x.prev;
        Node<E> n = x.next;
        p.setNext(n);
        n.setPrev(p);
        int s = size();
        s--;
        return   x.getElement();
    }
    public E removeFirst(){
        if (isEmpty())return null;
        return remove(head.next);
    }
    public E removeLast(){
        if (isEmpty())return null;
        return remove(tail.prev);
    }
    //q1 lab6
    public Node<E> findMiddleNode(){
        Node<E> slow = head.getNext();
        Node<E> fast = head.getNext();
        while (fast != tail && fast.getNext() != tail){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }
    // q4 lab6
    public void concatenateLists(DoublyLinkedList<E> otherList ){
        if (otherList.isEmpty()){
            return;
        }
        if (isEmpty()){
            head = otherList.head;
            tail = otherList.tail;
            return;
        }
        tail.next = otherList.head;
        otherList.head.prev = tail;
        tail= otherList.tail;
    }
    public void print(){
        Node current = head;
        while (current != null){
            System.out.println(current.getElement() + " ");
            current=current.next;

        }
  }
  //q6 lab6
    public void rotate(){
        if (isEmpty() || size() ==1)
            return;
        head=head.getNext();
    }
    public void rotateBackward(){
        if (isEmpty() || size() ==1)
            return;
        head=head.getPrev();
    }
    //q7 lan6
    public void clone(DoublyLinkedList clonedList) {
        if (isEmpty()){
            return;}
        Node<E> current = tail.getNext();
        while (current!= tail) {
            clonedList.addLast(current.getElement());
            current = current.getNext();
        }
        clonedList.addLast(current.getElement());
    }


    private static  class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
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
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        Node<Integer> middleNode = list.findMiddleNode();
        System.out.println("Middle node: "+ middleNode.getElement());
        DoublyLinkedList<Integer> M =  new DoublyLinkedList();
        M.addfirst(1);
        M.addfirst(4);
        M.addfirst(8);
//        System.out.println(list.equals(M));
//        list.concatenateLists(M);
//        list.print();
//        M.rotate();
//        M.print();
        list.clone(M);
        list.print();

    }
}