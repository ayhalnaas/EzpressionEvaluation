package lab8;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue<Integer>queue= new ArrayQueue<>(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        while (!queue.isEmpty())
            System.out.println(queue.dequeue());
    }
}