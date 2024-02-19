package ass4singlylinkedlist;

import java.util.Scanner;

public class SinglyLinkedList <E> {
    private Node<E> head = null;
    private Node<E> tail = null;

    public SinglyLinkedList() {
    }



    // q1 lab4
    @Override
    public boolean equals(Object obj) {
        if(this ==obj){
        return true;}
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        SinglyLinkedList<E> otherlist = (SinglyLinkedList<E>) obj ;
        Node<E> currentNode = head;
        Node<E> othercurrentNode = otherlist.head;
        while (currentNode != null && othercurrentNode != null){
            if (!currentNode.getElement().equals(othercurrentNode.getElement())){
                return false;
            }
            currentNode = currentNode.getNext();
            othercurrentNode = othercurrentNode.getNext();
        }
        return currentNode == null && othercurrentNode == null ;
    }
    // q3 lab4
    public int size(){

        int count = 0 ;
        Node<E> x = head;
        while (x!= null){
            count++;
            x = x.getNext();
        }
        return count;
    }
    public boolean isEmpty(){
        return  size()==0;
    }
    public E frist(){
        if (isEmpty())return null ;
        return head.getElement();
    }
    // q2 lab4
    public E beforeLast(){
        if(head == null || head.getNext() == null){
            return null;
        }
        Node<E> x = head;
        Node<E> beforelast = null ;
        while (x.getNext().getNext() != null){
            x = x.getNext();
        }
        beforelast = x;
        return beforelast.getElement();
    }
    public  E last (){
        if (isEmpty())return null ;
        return tail.getElement();

    }
    // q4 lab4
    public void rotate(){
        if (head == null || head.getNext() ==null){
            return;
        }
        tail= head;
            Node<E> beforelast = null ;
        while (tail.getNext() != null){
            beforelast=tail;
            tail = tail.getNext();
        }
        tail.setNext(head);
        head=tail;
        beforelast.setNext(null);
        tail=beforelast;
    }
    public void addfirst(E e){
        head = new Node<>(e ,head);
        if (size()==0)
            tail = head ;
        int s = size();
        s++;
    }
    public void addLast(E e){
        Node<E> newest = new Node<>(e ,null);
        if (size()==0)
            head = newest ;
        else
            tail.setNext(newest);
        tail=newest;
        int s = size();
        s++;
    }
    public E removeFirst(){
        if (isEmpty())return null;
        E deleted = head.getElement();
        head=head.getNext();
        int s = size();
        s--;
        if (size()==0)tail=null;
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
    // q5 lab4
    public void concatenateLists(SinglyLinkedList<E> otherList ){
        if (otherList.isEmpty()){
           return;
        }
        if (isEmpty()){
            head = otherList.head;
            tail = otherList.tail;
            return;
        }
       tail.setNext(otherList.head);
        tail= otherList.tail;
    }
    //q6 lab4
    public void reverse(){
        Node<E> prev = null ;
        Node<E> x = head ;
        Node<E> next = null ;
        while (x != null){
            next = x.getNext();
            x.setNext(prev);
            prev=x;
            x=next;
        }
        head = prev;
    }
    private static  class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
        public E getElement() {return element;}
        public Node<E> getNext() {return next;}
        public void setNext(Node<E> next) {this.next = next;}
        public void setElement(E element) { this.element = element; }

    }

    public static void main(String[] args) {

        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.addfirst(1);
        list1.addfirst(2);
        list1.addfirst(3);
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        list2.addfirst(4);
        list2.addfirst(5);
        list2.addfirst(6);
        SinglyLinkedList<Integer> list3 = new SinglyLinkedList<>();
        list3.addLast(3);
        list3.addLast(2);
        list3.addLast(1);

        System.out.println("The element: " + list1.print());
        list1.rotate();
        System.out.println("The element: " + list1.print());

        System.out.println(list1.equals(list2));
        list1.concatenateLists(list2);
        System.out.println("The element: " + list1.print());
        list1.reverse();
        System.out.println("The element: " + list1.print());
    }
    }


