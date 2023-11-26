package Lab_1;

import java.util.Scanner;

public class Q4 {


    public static void main(String[] args) {
        int[] students= new int[3];
        Scanner stu = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("enter number: ");
            int num =stu.nextInt();
            students[i]=num;
        }
        for (int student:students
             ) {
            System.out.println(student);
        }
    }
}
