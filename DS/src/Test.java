import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    SinglyLinkedList<Integer> l = new SinglyLinkedList<>();
    Scanner in = new Scanner(System.in);
    int choice ;
    while (true){
        System.out.println(" 1- add frist \n 2- add last \n 3- remove frist \n" +
                " 4- size \n 5- frist \n 6- last \n 7- view all \n 0- exit ");
        choice = in.nextInt();
        switch (choice){
            case 1 :
                System.out.println("input number to add frist");
                l.addfirst(in.nextInt());
                break;
            case 2 :
                System.out.println("input number to add last");
                l.addLast(in.nextInt());
                break;
            case 3 :
                System.out.println( l.removeFirst()+"remove successfully: ");
                break;
            case 4 :
                System.out.println( l.size()+"is  the size: ");
                break;
            case 5 :
                System.out.println( l.frist()+"is  the first element: ");
                break;
            case 6 :
                System.out.println( l.last()+"is  the last element: ");
                break;
            case 7 :
//                while (!l.isEmpty()){
//                    System.out.println(l.removeFirst()+" ");
//                }
                System.out.println( "is  the  element: "+l.print());
                break;
            case 0 :
                System.exit(0);

        }
    }
}
}
