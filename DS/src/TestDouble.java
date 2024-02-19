import java.util.Scanner;
import java.util.Stack;

public class TestDouble {
    public static void main(String[] args) {
        DoubleLinkedList<String> doubleLinkedList = new DoubleLinkedList<>();
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
