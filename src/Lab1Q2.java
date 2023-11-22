import java.util.Scanner;

public class Lab1Q2 {
    //Suppose that we create an array A of GameEntry objects,
    // which has an integer scores field,
    // and we clone A and store the result in an array B.
    // If we then immediately set A[4].score equal to 550,
    // what is the score value of the GameEntry object referenced by B[4]?
    public static void InputNum(){
        int[] A= new int[4];
        int[] B= new int[4];
        A = B;
        Scanner stu = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            System.out.println("enter score of game entry: ");
            int num =stu.nextInt();
            A[i]=num;
        }
        for (int a:A
        ) {
            System.out.println(a);

        }
        System.out.println("----------------");
        for (int b:B
        ) {
            System.out.println(b);

        }
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        InputNum();

    }


}




