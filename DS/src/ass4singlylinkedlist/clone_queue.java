package ass4singlylinkedlist;
//q2 lab8
import java.util.Arrays;

public class clone_queue<E> implements Cloneable{
    public static final int Capacity=10;
    private E[] elements;
    private int front;
    private int rear;
    private int size;

    public clone_queue() {
        elements = (E[]) new Object[Capacity];
        front=0;
        rear =-1;
        size = 0;
    }//q2 lab8
    public clone_queue<E> clone(){
        try {
            clone_queue<E> clonedQueue = (clone_queue<E>) super.clone();
            clonedQueue.elements = elements.clone();
            return clonedQueue;
        }catch (CloneNotSupportedException e){
            throw new InternalError(e);
        }
    }

}
