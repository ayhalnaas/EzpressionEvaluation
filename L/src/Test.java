import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CircularlyLinkedList<String>l=new CircularlyLinkedList<>();
        Scanner in= new Scanner(System.in);
        int choice;
        while (true)
        {
            System.out.println("1 addFirst 2 addLast 3 removeFirst 4 first " +
                    "5 last 6 size 7 rotate 8 view all" +
                    " 0 exit");
            choice= in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("input a name to add first");
                    l.addFirst(in.next());
                    System.out.println(l.first()+ " is added successfully");
                    break;
                case 2:
                    System.out.println("input a name to add last");
                    l.addLast(in.next());
                    System.out.println(l.last()+ " is added successfully");
                    break;
                case 3:
                    System.out.println(l.removeFirst()+" is removed successfully");
                    break;
                case 4:
                    System.out.println(l.first()+" is the first element");
                    break;
                case 5:
                    System.out.println(l.last()+" is the last element");
                    break;
                case 6:
                    System.out.println(l.size()+" is the size element");
                    break;
                case 7: l.rotate();
                    System.out.println(" rotated successfully");
                    break;
                case 8:
                    System.out.print("All names are: ");
                    for (int i = 0; i <l.size() ; i++) {
                        System.out.print(l.first()+" ");
                        l.rotate();

                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
