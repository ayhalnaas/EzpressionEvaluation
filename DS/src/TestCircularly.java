import java.util.Scanner;

public class TestCircularly {

        public static void main(String[] args) {
        CircularlyLinkedList<Integer> l = new CircularlyLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice ;
        while (true){
            System.out.println(" 1- add frist \t 2- add last \t 3- remove frist \n" +
                    " 4- size \t 5- frist \t 6- last \t 7- rotate 8- view all \t 0- exit ");
            choice = in.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("input number to add frist");
                    l.addfirst(in.nextInt());
                    break;
                case 2 :
                    System.out.println("input number to add last");
                    l.addlast(in.nextInt());
                    break;
                case 3 :
                    System.out.println( l.removefirst()+"remove successfully: ");
                    break;
                case 4 :
                    System.out.println( l.size()+"is  the size: ");
                    break;
                case 5 :
                    System.out.println( l.first()+"is  the first element: ");
                    break;
                case 6 :
                    System.out.println( l.last()+"is  the last element: ");
                    break;
                case 7:l.rotate();
                    System.out.println(  " rotate successfully:");
                    break;
                case 8 :
                    System.out.println("All number");
                    for (int i = 0; i < l.size(); i++) {
                        System.out.println(l.first()+" ");
                        l.rotate();
                    }
                    break;
                case 0 :
                    System.exit(0);

            }
        }
    }
    }

