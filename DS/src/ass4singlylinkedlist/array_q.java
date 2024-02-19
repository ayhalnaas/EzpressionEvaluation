package ass4singlylinkedlist;

public class array_q<E> implements CircularQueue<E>{

        E[] data;
        int size;
        int front;
        int rear;


        public array_q(int c) {
            data = (E[]) new Object[c];
            front=0;
            rear=-1;
            size=0;
        }
//q1 lab8
        public void rotate(){
            if (size <= 1){
                return;
            }
            E firstelement = data[front];
            front =(front +1)% data.length;
            rear =(rear +1)% data.length;
            data[rear]= firstelement;
        }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E first() {
        return null;
    }

    @Override
    public void enqueue(E element) {

    }

    @Override
    public E dequeue() {
        return null;
    }
}


