package Lab_1;

import java.util.Scanner;

public class Q6 {

    public static void InputNum(){
        int[] students= new int[3];
        int[] Teachers= new int[3];
        Teachers = students;
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
        for (int teach:Teachers
        ) {
            System.out.println(teach);
        }
    }
    public static void main(String[] args) {
        InputNum();

    }


}
