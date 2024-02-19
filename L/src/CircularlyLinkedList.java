public class CircularlyLinkedList <E>{
  private Node<E>tail=null;
  private int size=0;
  public CircularlyLinkedList(){}
    public int size(){return size;}
    public boolean isEmpty(){
      return size==0;}

    public E first()
    {
        if (isEmpty())return null;
        return tail.getNext().getElement();
    }
    public E last()
    {
        if (isEmpty())return null;
        return tail.getElement();
    }

   public void addFirst(E ee)
   {if (size==0)
       {
           tail=new Node<E>(ee,null);
           tail.setNext(tail);
       }else
       {
           Node<E>newest= new Node<>(ee,tail.next);
           tail.setNext(newest);
       }size++;}
   public void addLast(E ee)
   {
       addFirst(ee);
       tail=tail.next;
   }

   public E removeFirst()
   {
       if(isEmpty())return null;
       Node<E>x=tail.next;
       if (x==tail)
           tail=null;
       else
           tail.setNext(x.getNext());
       size--;
       return x.element;
   }
   public void rotate()
   {
       if (tail!=null)
           tail=tail.next;
   }






















    private static class Node<E>
    {
        E element;
        Node<E>next;

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
}
