//ayh al_naas

//  DoubleLinkedList أكتب كود بلغة الجافا يستخدم كلاس
//لإنشاء دالة وظيفتها حساب الحجم (العدد) لل"node" الموجودة
//من دون استخدام "instance variable"
public class DoubleLinkedList<E> {
        private Node<E> head;
        private Node<E> tail;
        private int size = 0 ;

        public DoubleLinkedList() {
            head = new Node<>(null,null,null);
            tail = new Node<>(null,head,null);
            head.setNext(tail);
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

            return tail.getPrev().getElement();

        }
        private void addBetween(E e,Node<E> p,Node<E> n){
            Node<E> newest = new Node<>(e,p,n);
            p.setNext(newest);
            n.setPrev(newest);
            size++;
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
            size--;
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
        }}


