import java.util.Scanner;

public class TestQueue {
    public static void main(String[] args) {
//        LinkedQueue<Integer>q= new LinkedQueue<>();
//        q.enqueue(11);
//        q.enqueue(12);
//    q.enqueue(13);
//        System.out.println(q.first()+"is the first");
//        System.out.println(q.size()+" is the size");
//        System.out.println(q.dequeue()+" is removed ");
//        System.out.println(q.dequeue()+" is removed ");
//        System.out.println(q.dequeue()+" is removed ");
//        System.out.println(q.dequeue()+" is removed ");
        LinkedQueue<Integer> queue= new LinkedQueue<>();
        LinkedStack<Integer> stack= new LinkedStack<>();

        int x ;
        System.out.println("x= "+0);
        queue.enqueue(0);
        stack.push(0);
        Scanner in = new Scanner(System.in);
        x= in .nextInt();
        System.out.println("x= "+x);
        while (x!= -999){
            switch (x%4){
                case 0:
                    queue.enqueue(x);
                    stack.push(x);
                    break;
                case 1:
                    if (!stack.isEmpty()){
                        System.out.println("Stack Element: ");
                        System.out.println(stack.top());
                        stack.pop();
                    }else {
                        System.out.println("sorry the stack is empty. ");
                        break;
                    }
                case 2:
                    queue.enqueue(x);
                    break;
                case 3:
                    if (!queue.isEmpty()){
                        System.out.println("Queue Element: ");
                        System.out.println(queue.first());
                        queue.dequeue();
                    }else {
                        System.out.println("sorry the queue is empty. ");}
                        break;
            }
            x= in.nextInt();
            System.out.println("x= "+x);

        }
        System.out.println("Stack Element: ");
        while (!stack.isEmpty()){
            System.out.println(stack.top());
            stack.pop();

        }
        System.out.println("Queue Element: ");
        while (!queue.isEmpty()){
            System.out.println(queue.first());
            queue.dequeue();

        }



    }
}
